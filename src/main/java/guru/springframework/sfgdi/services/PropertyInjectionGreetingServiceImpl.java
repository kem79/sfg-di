package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectionGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World! - Property";
    }
}
