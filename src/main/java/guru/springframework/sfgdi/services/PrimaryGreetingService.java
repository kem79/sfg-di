package guru.springframework.sfgdi.services;


public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World - EN";
    }
}
