package co.grandcircus.TicketMaster;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TicketController {

	
	
	@RequestMapping ("/")
	ModelAndView mav = new ModelAndView("index");
	return mav;
	
	
}
