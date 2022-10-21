package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
   
   private final String command = "main.main";
   private final String getPage = "/mainhome";
   
	
   
   @RequestMapping(command)
   public String main() {
   
		
      return getPage;
   }
   
   
}