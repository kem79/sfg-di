package guru.springframework.sfgdi.services;


public class PrimarySpanishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hola Mundo - ES";
    }
}
