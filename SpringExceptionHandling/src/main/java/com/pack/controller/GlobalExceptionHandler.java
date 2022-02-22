package com.pack.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    
	@ExceptionHandler(SQLException.class)
	public String handleSQLException(HttpServletRequest req,Exception e) {
		return "databaseerror";
		
	}
	
	public String handleIOException(HttpServletRequest req,Exception e) {
		return "404";
}
}
