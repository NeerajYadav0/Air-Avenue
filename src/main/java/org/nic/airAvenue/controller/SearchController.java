package org.nic.airAvenue.controller;

import java.util.ArrayList;
import java.util.List;

import org.nic.airAvenue.dao.AirportDao;
import org.nic.airAvenue.dao.SearchDao;
import org.nic.airAvenue.entity.Search;
import org.nic.airAvenue.entity.flightDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@Service
@Controller
public class SearchController {
	@Autowired
	SearchDao sdao;
	
	@RequestMapping("/searchAct")
	public String searchAct(@ModelAttribute Search srch, Model model)
	{  List<flightDetails> fli = new ArrayList<flightDetails>();
	fli = sdao.searchFlight(srch);
	model.addAttribute("SearchedFlight",fli);
	System.out.println(fli);
		return "searchAct";
	}
	
}
