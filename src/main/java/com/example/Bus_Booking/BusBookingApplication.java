package com.example.Bus_Booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
		org.springframework.ai.vectorstore.azure.autoconfigure.AzureVectorStoreAutoConfiguration.class
})
public class BusBookingApplication {
	public static void main(String[] args) {
		SpringApplication.run(BusBookingApplication.class, args);
	}
}
