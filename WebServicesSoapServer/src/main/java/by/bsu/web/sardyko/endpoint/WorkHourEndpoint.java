package by.bsu.web.sardyko.endpoint;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import by.bsu.web.sardyko.models.hour.GetMinutesUntilCloseResponse;
import by.bsu.web.sardyko.models.hour.GetOpenHourForSpecificDayRequest;
import by.bsu.web.sardyko.models.hour.GetOpenHourRequest;
import by.bsu.web.sardyko.models.hour.GetOpenHoursForSpecificDayResponse;
import by.bsu.web.sardyko.models.hour.GetOpenHoursResponse;
import by.bsu.web.sardyko.models.hour.Hour;
import by.bsu.web.sardyko.models.hour.IsOpenResponse;
import by.bsu.web.sardyko.repository.HourRepository;

public class WorkHourEndpoint {
	private static final String NAMESPACE_URI = "http://sardyko.web.bsu.by/models/hour";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getOpenHoursRequest")
	@ResponsePayload
	public GetOpenHoursResponse getOpenHoursRequest(@RequestPayload GetOpenHourRequest request) {
		GetOpenHoursResponse response = new GetOpenHoursResponse();

		for (int i = 0; i < 7; i++) {
			HourRepository day = HourRepository.values()[i];
			Hour hour = new Hour();
			XMLGregorianCalendar opens;
			try {
				opens = DatatypeFactory.newInstance().newXMLGregorianCalendar();
				opens.setTime(day.getStart(), 0, 0);
				hour.setOpens(opens);
			} catch (DatatypeConfigurationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			XMLGregorianCalendar closes;
			try {
				closes = DatatypeFactory.newInstance().newXMLGregorianCalendar();
				closes.setTime(day.getEnd(), 0, 0);
				hour.setCloses(closes);
			} catch (DatatypeConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.getHourList().getHour().add(hour);
		}
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getOpenHoursForSpecificDayRequest")
	@ResponsePayload
	public GetOpenHoursForSpecificDayResponse getOpenHoursForSpecificDayRequest(
			@RequestPayload GetOpenHourForSpecificDayRequest request) {
		GetOpenHoursForSpecificDayResponse response = new GetOpenHoursForSpecificDayResponse();
		HourRepository day = HourRepository.values()[request.getDayOfWeek()];

		Hour hour = new Hour();
		XMLGregorianCalendar opens;
		try {
			opens = DatatypeFactory.newInstance().newXMLGregorianCalendar();
			opens.setTime(day.getStart(), 0, 0);
			hour.setOpens(opens);
		} catch (DatatypeConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		XMLGregorianCalendar closes;
		try {
			closes = DatatypeFactory.newInstance().newXMLGregorianCalendar();
			closes.setTime(day.getEnd(), 0, 0);
			hour.setCloses(closes);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response.setHour(hour);
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "isOpenAtTheMomentRequest")
	@ResponsePayload
	public IsOpenResponse isOpenAtTheMoment() {
		IsOpenResponse response = new IsOpenResponse();
		HourRepository todaySchedule = HourRepository.values()[LocalDate.now().getDayOfWeek().ordinal()];
		int nowHour = LocalDateTime.now().getHour();
		response.setOpen(nowHour > todaySchedule.getStart() && nowHour < todaySchedule.getEnd());
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMinutesUntilCloseRequest")
	@ResponsePayload
	public GetMinutesUntilCloseResponse getMinutesUntilCloserequest() {
		GetMinutesUntilCloseResponse response = new GetMinutesUntilCloseResponse();
		HourRepository todaySchedule = HourRepository.values()[LocalDate.now().getDayOfWeek().ordinal()];
		int nowHour = LocalDateTime.now().getHour();
		int minutesUntilClose = todaySchedule.getEnd() - nowHour;
		response.setMinuteUntilClose(minutesUntilClose > 0 ? minutesUntilClose : 0);
		return response;
	}
}
