package com.project.eventlistner;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AppReadyEvent {

	@EventListener(ApplicationReadyEvent.class)
	public void process() throws Exception {

		System.out.println("Runnig when application context is registered");
	}

}
