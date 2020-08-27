package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    //Tell spring to inject instance of the greetingService
    //Had to make GreetingServiceImpl a @Service annotation
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
