package co.grandcircus.TicketMaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.TicketMaster.model.Events;

@Controller
public class ApiController {

	@Autowired
	ApiService apiService;

	@RequestMapping("/")
	public ModelAndView home() {

		List<Events> shows = apiService.findAllEvents();

		return new ModelAndView("index", "events", shows);

	}

	@RequestMapping("/fav")
	public ModelAndView favorite() {
		ModelAndView mav = new ModelAndView("favorite");
		return mav;
	}
	
	//Test Bench Page for adding items.
	@RequestMapping("/testApi")
	public ModelAndView testApi() {

		List<Events> shows = apiService.findAllEvents();

		return new ModelAndView("testApi", "events", shows);

	}
	

}