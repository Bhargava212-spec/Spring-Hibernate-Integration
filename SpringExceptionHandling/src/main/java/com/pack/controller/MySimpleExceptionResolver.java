package com.pack.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

public class MySimpleExceptionResolver extends SimpleMappingExceptionResolver {
  
	public String buildLogMessage(Exception e, HttpServletRequest req) {
		return "Spring MVC Exception "+ e.getLocalizedMessage();
	}
}
