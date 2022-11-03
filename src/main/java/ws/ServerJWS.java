package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {

        public static void main(String[] args) {

            Endpoint.publish("http://localhost:8080/BanqueWS", new BanqueService());

        }

}
