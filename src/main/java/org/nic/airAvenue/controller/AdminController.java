package org.nic.airAvenue.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.nic.airAvenue.dao.AirportDao;
import org.nic.airAvenue.dao.BookingDao;
import org.nic.airAvenue.dao.CompanyDao;
import org.nic.airAvenue.dao.FlightDao;
import org.nic.airAvenue.entity.Search;
import org.nic.airAvenue.entity.airport;
import org.nic.airAvenue.entity.company;
import org.nic.airAvenue.entity.booking;
import org.nic.airAvenue.entity.flightDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Component
@Service
@Controller
public class AdminController {
	
	
	// company controller
	@ModelAttribute("company")
	public company getCompany() {
    
		return new company();
	}
	@Autowired
	private CompanyDao cdao;

@RequestMapping("/company")
public String company(Model model) {
	
	List<company> comp = new ArrayList<company>();
	comp = cdao.show();
	model.addAttribute("company", comp);
    model.addAttribute("option", "show");
	return "company";
}
@RequestMapping("/addCompany")
public String companyAdd(Model model)
{ model.addAttribute("option","add" );
	return "company";
}
@RequestMapping("/updateCompany")
public String updateCompany(@RequestParam("companyName") String companyName, HttpServletRequest request,Model  model)
{   System.out.println(companyName);
HttpSession session = request.getSession();
model.addAttribute("option","update" );
session.setAttribute("CompanyName", companyName);

return "company";
}


@RequestMapping("updateCompanyAct")
public String updateCompanyAct(@ModelAttribute company comp,HttpServletRequest request,Model model )
{    HttpSession session = request.getSession();

String CompanyName= (String) session.getAttribute("CompanyName");
  cdao.update(comp,CompanyName);
  session.removeAttribute("CompanyName");
  List<company> com = new ArrayList<company>();
  com = cdao.show();
	model.addAttribute("company", com);
	 model.addAttribute("option", "show");
	return "company";
}


@RequestMapping("/addCompanyAct")
public String addCompanyAct(@ModelAttribute company Company, Model model)
{	 cdao.insert(Company);
	List<company> com = new ArrayList<company>();
	  com = cdao.show();
	  model.addAttribute("company", com);
	  model.addAttribute("option", "show");
	  model.addAttribute("option","show");
	return "company";
}
@RequestMapping("deleteCompany")
public String deleteComapny(@RequestParam("companyName") String compName, Model model)

{cdao.delete(compName);
List<company> com = new ArrayList<company>();
com = cdao.show();
model.addAttribute("company", com);
model.addAttribute("option","show");
	return "company";
}

// airport controller
@Autowired
AirportDao adao;

@ModelAttribute("Search")
public Search getSearch()
{
	return new Search(adao);
}


@ModelAttribute("airport")
public airport getAirport()
{
	return new airport();
}


@RequestMapping("/airport")
public String airport(Model model)
{ model.addAttribute("option","show");
List<airport> air = new ArrayList<airport>();
air = adao.show();
model.addAttribute("airport", air);
	return "airport";
}
@RequestMapping("/updateAirport")
public String updateAirport(@RequestParam("name") String aName, HttpServletRequest request,Model  model)
{   System.out.println(aName);
HttpSession session = request.getSession();
model.addAttribute("option","update" );
session.setAttribute("airportName", aName);

return "airport";
}
@RequestMapping("updateAirportAct")
public String updateAirportAct(@ModelAttribute airport air,HttpServletRequest request,Model model )
{    HttpSession session = request.getSession();

String aName= (String) session.getAttribute("airportName");
  adao.update(air,aName);
  session.removeAttribute("airportName");
  List<airport> airp = new ArrayList<airport>();
  airp = adao.show();
	model.addAttribute("airport", airp);
	 model.addAttribute("option", "show");
	return "airport";
}
@RequestMapping("/addAirport")
public String airportAdd(Model model)
{ model.addAttribute("option","add" );
	return "airport";
}
@RequestMapping("/addAirportAct")
public String addAirportAct(@ModelAttribute airport air, Model model)
{	 adao.insert(air);
	List<airport> airp = new ArrayList<airport>();
	  airp = adao.show();
	  model.addAttribute("airport", airp);
	  model.addAttribute("option", "show");
	return "airport";
}
@RequestMapping("/deleteAirport")
public String deleteAirport(@RequestParam("name") String aName, Model model)

{adao.delete(aName);
List<airport> airp = new ArrayList<airport>();
airp = adao.show();
model.addAttribute("airport", airp);
model.addAttribute("option", "show");
return "airport";
}
// flight controller
@Autowired
FlightDao fdao;
@ModelAttribute("flightDetails")
public flightDetails getFlight()
{
	return new flightDetails(adao, cdao);
}
@RequestMapping("/flight")
public String Flight(Model model)
{
	model.addAttribute("option","show");
	List<flightDetails> fli = new ArrayList<flightDetails>();
	fli = fdao.show();
	model.addAttribute("flightDetails", fli);
		return "flight";
}
@RequestMapping("/addFlight")
public String flightAdd(Model model)
{ model.addAttribute("option","add" );
	return "flight";
}
@RequestMapping("/addFlightAct")
public String addFlightAct(@ModelAttribute flightDetails fli, Model model)
{	 fdao.insert(fli);
	List<flightDetails> f = new ArrayList<flightDetails>();
	  f = fdao.show();
	  model.addAttribute("flightDetails", f);
	  model.addAttribute("option", "show");
	  model.addAttribute("option","show");
	return "flight";
}
@RequestMapping("/deleteFlight")
public String deleteFlight(@RequestParam("fno") int fno, Model model)

{
	bdao.cancelFlight(false, fno);
	fdao.delete(fno);

model.addAttribute("option","show");
List<flightDetails> fli = new ArrayList<flightDetails>();
fli = fdao.show();
model.addAttribute("flightDetails", fli);
	return "flight";
}
@RequestMapping("/updateFlight")
public String updateFlight(@RequestParam("fno") int fno, HttpServletRequest request,Model  model)
{   
HttpSession session = request.getSession();
model.addAttribute("option","update" );
session.setAttribute("flightNo", fno);
flightDetails fli = fdao.search(fno);
model.addAttribute("fli",fli);
return "flight";
}
@RequestMapping("updateFlightAct")
public String updateFlightAct(@ModelAttribute flightDetails fli,HttpServletRequest request,Model model )
{    HttpSession session = request.getSession();

int f=  (Integer) session.getAttribute("flightNo");
  fdao.update(fli,f);
  session.removeAttribute("flightNo");
  model.addAttribute("option","show");
  List<flightDetails> flig = new ArrayList<flightDetails>();
  flig = fdao.show();
  model.addAttribute("flightDetails", flig);
  	return "flight";
}

// booking details 

@Autowired
BookingDao bdao;

@RequestMapping("/booking")
public String booking(Model model)
{
	List<flightDetails> fli = fdao.show();
	model.addAttribute("flightDetails",fli);
	
	return "flightDetails";
}
@RequestMapping("/viewBooking")
public String viewBooking(@RequestParam("fno") int fno, Model model)
{
	List<booking> book = bdao.searchByFno(fno);
	model.addAttribute("book",book);
	flightDetails fli = fdao.search(fno);
	model.addAttribute("flightDetails",fli);
	
	return "flightBooking";
	
}

}
