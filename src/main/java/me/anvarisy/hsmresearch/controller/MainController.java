package me.anvarisy.hsmresearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import me.anvarisy.hsmresearch.entity.response.HelloResponse;
import me.anvarisy.hsmresearch.entity.response.InitializeResponse;
import me.anvarisy.hsmresearch.service.SecurityService;


@Controller
public class MainController {

    @Autowired
    private SecurityService secService;

   @GetMapping("/hello")
   @ResponseBody
   public HelloResponse getMethodName() {
       return new HelloResponse("This app can be used normally");
   }
   
   @GetMapping("/hsm/initialize")
   @ResponseBody
   public InitializeResponse initializeHsm(){
    boolean status = secService.checkMethod();
    return new InitializeResponse("Complete", status);
   }
}
