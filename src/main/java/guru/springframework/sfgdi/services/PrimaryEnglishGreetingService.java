package guru.springframework.sfgdi.services;


public class PrimaryEnglishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World - EN";
    }
}
