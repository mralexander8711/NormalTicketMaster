package co.grandcircus.TicketMaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.TicketMaster.model.Event;

@Controller
public class ApiController {

	@Autowired
	ApiService apiService;

	@RequestMapping("/")
	public ModelAndView home() {

		List<Event> shows = apiService.findAllEvents();

		return new ModelAndView("index", "events", shows);
	}

}
