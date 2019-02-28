package co.grandcircus.TicketMaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//import co.grandcircus.TicketMaster.model.Embed;

@Controller
public class ApiController {

	@Autowired
	ApiService apiService;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("index");
		return mav;

		/*
		 * _Embedded shows = apiService.findAllEvents(); return new
		 * ModelAndView("index", "events", shows);
		 */

	}

	@RequestMapping("/fav")
	public ModelAndView favorite() {
		ModelAndView mav = new ModelAndView("favorite");
		return mav;
	}
}