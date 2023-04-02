package com.example.query;

import org.springframework.stereotype.Controller;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
//import com.example.request.SampleRequest;

@Controller
public class Query implements GraphQLQueryResolver{
	public String firstQuery () {
		return "First query";
	}
	
	public String secondQuery () {
		return "Second query";
	}
	
	public String fullName (String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
//	public String fullName2 (SampleRequest sampleRequest) {
//		return sampleRequest.firstName + " " + sampleRequest.lastName; 
//	}
}
