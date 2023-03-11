package org.nic.airAvenue.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.nic.airAvenue.dao.BookingDao;
import org.nic.airAvenue.dao.BookingLoginDao;
import org.nic.airAvenue.dao.FlightDao;
import org.nic.airAvenue.entity.booking;
import org.nic.airAvenue.entity.bookingLogin;
import org.nic.airAvenue.entity.flightDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
	@ModelAttribute("booking")
	public booking getBooking()
	{
		return new booking();
	}
	@ModelAttribute("bookingLogin")
	public bookingLogin getbookingLogin()
	{
		return new bookingLogin();
	}
	@Autowired
	BookingDao bdao;
	@Autowired
	FlightDao fdao;
	@Autowired
	BookingLoginDao ldao;
	
	@RequestMapping("/bookTicket")
	public String bookTicket(@RequestParam("flightNo") int flightNo, HttpServletRequest request)
	{HttpSession session = request.getSession();
	session.setAttribute("FlightNo", flightNo);
	System.out.println("1");
	System.out.println(flightNo);
		return "bookingForm";
	}
	
	
	
	@RequestMapping("/bookAct")
	public String bookAct(@ModelAttribute booking book, HttpServletRequest request )
	{HttpSession session = request.getSession();
	int flightNo= (Integer) session.getAttribute("FlightNo");
		
	flightDetails flight= new flightDetails();
	System.out.println(fdao.search(flightNo));
	flight = fdao.search(flightNo);
	
	bookingLogin bookl = new bookingLogin();
	bookl= ldao.search(book.getEmail());
	System.out.println(bookl.getPassword());
	System.out.println(book.getPassword());
	String a = bookl.getPassword();
	String b = book.getPassword();
	
	
	if(bookl.getUserName() == null || a.equals(b) )
	{
		if(bookl.getUserName() == null)
		{
		bookl.setUserName(book.getEmail());
		bookl.setPassword(book.getPassword());
		
		bookl.setPhoneNo(book.getMobileNo());
	
		ldao.insert(bookl);
		}
		if(book.getNoOfTickets() > flight.getSeatsLeft() )
		{ return"";
			
		}else {
			
			boolean check= true;
			long id=0;
			while(check)
			{
				id= (long) (Math.random()*100000);
				if(bdao.check(id))
				{
					check=false;
				}
			}
			System.out.println(id);

			book.setBookingId(id);
			book.setFlightNo(flightNo);
			System.out.println(book);
		session.removeAttribute("FlightNo");
		flight.setSeatsLeft(flight.getSeatsLeft()- book.getNoOfTickets() ) ;
		flight.setBookedSeats(flight.getBookedSeats()+ book.getNoOfTickets()) ;
		fdao.update(flight, flightNo);
		book.setActiveFlight(true);
		bdao.insert(book);
		System.out.println(book);
			return"";
		}
		
		
		
	}
	else
	{
		System.out.println("wrong password");
		return "";
	}
	
	
	}
	
	@RequestMapping("/tickets")
	public String tickets() {
		return "tickets";
	}
	
	@RequestMapping("/ticketsAct")
	public String ticketsAct(@ModelAttribute bookingLogin blog, Model model )
	{	if(ldao.login(blog))
	{
		List<booking> book = new ArrayList<booking>();
		book= bdao.search(blog.getUserName());
		
		model.addAttribute("book",book);
		return "bookingDetails";
	}
		System.out.println("wrong infromation"); 
		
		return "";
	}
	
	@RequestMapping("/generateTicket")
	public String generateTicket(@RequestParam("flightNo") int flightNo, @RequestParam("bookingId") long bookingId, Model model )
	{   flightDetails fli= fdao.search(flightNo);
		booking book = bdao.searchById(bookingId);
		model.addAttribute("book",book);
		model.addAttribute("flightDetails",fli);
		long amount = book.getNoOfTickets() * fli.getCost();
		model.addAttribute("amount",amount);
		return  "generateTicket";
	}
	
	@RequestMapping("/cancel")
	public String cancel(@RequestParam("flightNo") int flightNo, @RequestParam("bookingId") long bookingId,@RequestParam("email") String email ,Model model)
	{
		booking book = bdao.searchById(bookingId);
		flightDetails fli = fdao.search(flightNo);
		fli.setSeatsLeft(fli.getSeatsLeft()+ book.getNoOfTickets());
		fli.setBookedSeats( fli.getBookedSeats() - book.getNoOfTickets() );
		fdao.update(fli, flightNo);
		bdao.delete(bookingId);
		System.out.println("record deleted");
		
		List<booking> booki = new ArrayList<booking>();
		booki= bdao.search(email);
		System.out.println("before sysout"); 
		System.out.println(booki.get(0)); 
		model.addAttribute("book",booki);
		return "bookingDetails";
		
	}
	
}
