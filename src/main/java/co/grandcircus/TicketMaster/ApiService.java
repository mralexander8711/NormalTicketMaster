package co.grandcircus.TicketMaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.TicketMaster.model.EventResponse;
import co.grandcircus.TicketMaster.model.Events;

@Component
public class ApiService {

	@Value("${myapi.key}")
	String myApiKey;
	String query = "";

	private RestTemplate restTemp = new RestTemplate();

	public List<Events> findAllEvents() {
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?apikey=" + myApiKey;

		EventResponse response = restTemp.getForObject(url, EventResponse.class);

		return response.getEmbed().getEvents();
	}

}
