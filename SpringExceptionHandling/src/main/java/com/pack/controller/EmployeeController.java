package com.pack.controller;

 

import java.io.IOException;
import java.sql.SQLException;

 

import javax.servlet.http.HttpServletRequest;

 

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

 

@Controller
public class EmployeeController {
@RequestMapping(value="/emp/{id}")
public String getEmployee(@PathVariable("id")int id,ModelMap map) throws Exception{
String result="";
if(id==2) {
throw new EmployeeNotFoundException();
}
else if(id==3) {
    throw new SQLException("SQLException with id="+id);
    
}
else if(id==4) {
    throw new IOException("IOException with id ="+id);
}
else if(id==1) {
map.addAttribute("message","Hello world");
result="home";
}
return result;
}
@ExceptionHandler(EmployeeNotFoundException.class)
public ModelAndView handleEmployeeNotFoundException(HttpServletRequest req,Exception e) {
ModelAndView modelAndView=new ModelAndView();
modelAndView.addObject("url",req.getRequestURL());
modelAndView.addObject("ex",e);
modelAndView.setViewName("error");
return modelAndView;
}

 

}