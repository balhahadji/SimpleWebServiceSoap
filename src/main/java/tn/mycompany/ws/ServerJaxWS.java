package tn.mycompany.ws;

import jakarta.xml.ws.Endpoint;

public class ServerJaxWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
        System.out.println("Web Service deployé sur http://0.0.0.0:9191/");
    }
}
