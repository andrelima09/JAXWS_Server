package main;

import javax.jws.*;
import javax.xml.ws.Endpoint;

import ws.DemoImpl;

public class main {

	public static void main(String[] args) {
		
		try {
			Endpoint.publish("http://localhost:8080/ws/demo",new DemoImpl());
			System.out.println("Done");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
