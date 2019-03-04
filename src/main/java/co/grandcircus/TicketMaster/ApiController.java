package co.grandcircus.TicketMaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
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

	@RequestMapping("/search")
	public ModelAndView homeSearch(@RequestParam(value = "keyword", required = false) String keyword) {
		List<Events> shows = apiService.findAllEvents(keyword);
		return new ModelAndView("search", "events", shows);
	}

	@RequestMapping("/fav")
	public ModelAndView favorite() {
		ModelAndView mav = new ModelAndView("favorite");
		return mav;
	}

	// Test Bench Page for adding items.
//	@RequestMapping("/testApi")
//	public ModelAndView testApi() {
//
//		List<Events> shows = apiService.findAllEvents();
//
//		return new ModelAndView("testApi", "events", shows);
//
//	}

	@RequestMapping("/details/{id}")
	public ModelAndView details(@PathVariable(value = "id", required = false) String id) {

		Events event = apiService.findById(id);
		try {
			return new ModelAndView("details", "show", event);
		} catch (HttpClientErrorException e) {
			throw new RuntimeException("Unable to retrieve details.");
		}
	}

}