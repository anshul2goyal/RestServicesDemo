package com.test.jersey.client;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class MyResourceClient { 
	
	public static void main(String[] args){
		//Change the URI as per the host client
		String uri = "http://localhost:9080/example.jersey/rest/myresource";
		Client client = Client.create();
		WebResource resource = client.resource(uri);
		ClientResponse clientResponse = resource.type(MediaType.TEXT_PLAIN).get(ClientResponse.class);
		if(clientResponse.getStatus() == 200){
			System.out.println("Response is ::");
		}
		
	}

}
