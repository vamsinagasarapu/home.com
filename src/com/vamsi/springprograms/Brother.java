package com.vamsi.springprograms;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Brother {
	
	//@ResponseBody
	@RequestMapping("/order")
	public String getInput() {
		return "orderpage";
		
	}

	@RequestMapping("/processOrder")
	public String displayConfirmation(Model model, HttpServletRequest request) {
		
		String orderedItem=request.getParameter("foodType");
		String name="vamsi Krishna";
		model.addAttribute("OrderedItemName",orderedItem);
		model.addAttribute("personName",name);
		return "confirmationpage";
		
	}
}
