package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World! - Constructor";
    }
}
