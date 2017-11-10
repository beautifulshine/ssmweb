package com.li.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("paramController")
public class ParamController {

	   @RequestMapping("requestParam")    
	   public String filesView() {    
	    return "infoView";  
	   }     
	
	@RequestMapping("testRequestParam")    
	   public String filesUpload(@RequestParam(value="inputStr",required=false) String inputStr11,
			   String inputStr2,  @RequestParam("inputStr3")String inputStr33, 
			   @RequestParam(value="inputInt2",required=false)Integer inputInt2,
			   HttpServletRequest request) {    
	    System.out.println(inputStr11); 
	    System.out.println(inputStr2);
	    System.out.println(inputStr33);  
	    System.out.println(inputInt2);
	    int inputInt = Integer.valueOf(request.getParameter("inputInt"));  
	    System.out.println(inputInt);  
	    // ......省略  
	    return "success";  
	   }     


}
