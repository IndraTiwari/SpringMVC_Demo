package com.itc.eventController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itc.model.Events;

@Controller
public class EventsController {
	@RequestMapping("/showEventForm")
	public ModelAndView showEventForm(ModelMap map) throws Exception {
		Events event = new Events();
		map.addAttribute("event", event);

		return new ModelAndView("eventForm");
	}

	@ModelAttribute("eventTypes")
	public List<String> addEventType() {
		List<String> eventTypes = new ArrayList<String>();
		eventTypes.add("Cricket");
		eventTypes.add("Football");
		eventTypes.add("Badminton");
		eventTypes.add("Athelatics");

		return eventTypes;
	}

	@RequestMapping("/addEvent")
	public ModelAndView addEvent(@ModelAttribute("event") Events event) throws Exception {
		List<Events> events = new ArrayList<Events>();
		events.add(new Events("Bazil v/s Argentina",  
			    "Rio de Janeiro", 1350, "Football")); 
		events.add(new Events("England v/s Australia","London",1000,"Cricket"));	  
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("display");
		// later on the list will be fetched from the table
		
		
		events.add(event);
		modelAndView.addObject("eventList", events);
		return modelAndView;

	}
}
