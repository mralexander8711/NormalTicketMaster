package co.grandcircus.TicketMaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.TicketMaster.model.Event;
import co.grandcircus.TicketMaster.model.EventResponse;

@Component
public class ApiService {

	@Value("${myapi.key}")
	String myApiKey;

	private RestTemplate restTemp = new RestTemplate();

	public List<Event> findAllEvents() {
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?apikey=" + myApiKey;

		EventResponse response = restTemp.getForObject(url, EventResponse.class);

		return response.getEvents();
	}

}