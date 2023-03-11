package org.nic.airAvenue.controller;

import org.nic.airAvenue.dao.AirportDao;
import org.nic.airAvenue.entity.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IntroController {
 @RequestMapping("search")
 
	public String search()
	{
		return "search";
	}
 @RequestMapping("/admin")
 public String admin() {
	 return "admin";
 }
 @Autowired
 AirportDao adao;

 @ModelAttribute("Search")
 public Search getSearch()
 {
 	return new Search(adao);
 }

}
