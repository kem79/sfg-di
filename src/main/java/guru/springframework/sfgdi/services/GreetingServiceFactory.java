package guru.springframework.sfgdi.services;

public class GreetingServiceFactory {

    public GreetingService createGreetingService(String lang){

        switch(lang){
            case "en":
                return new PrimaryEnglishGreetingService();
            case "es":
                return new PrimarySpanishGreetingService();
            default:
                return new PrimaryGreetingService();
        }
    }
}
