//find/replace instances of 'java22displaydate' with trueName of project
package com.jonfriend.java29ninjagoldgame.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.time.LocalDateTime; 
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.text.SimpleDateFormat; 
import java.util.ArrayList; 

//import Item.java; 
import com.jonfriend.java29ninjagoldgame.models.Item;

@Controller

public class NinaGoldController {
	

	@RequestMapping(value = "/processLogin", method=RequestMethod.POST)
	public String processLogin(
		@RequestParam(value="elNumero") String elNumero,
	    @RequestParam(value="city") String city,
	    @RequestParam(value="person") String person,
	    @RequestParam(value="profHobb") String profHobb,
	    @RequestParam(value="animal") String animal,
	    @RequestParam(value="nicety") String nicety,
		HttpSession session
		, RedirectAttributes redirectAttributes) 
		{
	    	// CODE TO PROCESS FORM ie. check email and password
//			String emailSubmitted = email;
			
			session.setAttribute("elNumero", elNumero) ;
			session.setAttribute("city", city) ;
			session.setAttribute("person", person) ;
			session.setAttribute("profHobb", profHobb) ;
			session.setAttribute("animal", animal) ;
			session.setAttribute("nicety", nicety) ;
			
			redirectAttributes.addFlashAttribute("displayMessage", "Thanks for the good submission!");
	    	return "redirect:/dashboard"; // <-- we'll change this when we learn redirecting
	}
	
	@RequestMapping("/dashboard") 
	public String displayDashboard(Model model, HttpSession session) {
		// get any info needed out of session and add to the view model to render on the page.
        
//    	String elNumero = (String) session.getAttribute("elNumero");
//		model.addAttribute("elNumero", elNumero);
//		
//		String city = (String) session.getAttribute("city");
//		model.addAttribute("city", city);
//		
//		String person = (String) session.getAttribute("person");
//		model.addAttribute("person", person);
		return "dashboard.jsp"; 
	}
	
	
	
	
	
	
	
	
	
// end of methods
}
