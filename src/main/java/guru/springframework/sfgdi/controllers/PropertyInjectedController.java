package guru.springframework.sfgdi.controllers;


import guru.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayHello();
    }


}
