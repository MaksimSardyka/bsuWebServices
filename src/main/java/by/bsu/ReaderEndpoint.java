package by.bsu;

import javax.xml.ws.Endpoint;

import org.springframework.stereotype.Component;

import by.bsu.server.services.ReaderServiceDefault;

//TODO: modify to Endpoint
@Component
public class ReaderEndpoint {
    private static final String URI = "http://localhost:8081/readerservice";

    public static void readerServiceEndpoint() {
        Endpoint.publish(URI, new ReaderServiceDefault());
    }

    public static void main(String[] args) {
        readerServiceEndpoint();
    }
}
