package guru.springframework.sfgdi;

import guru.springframework.sfgdi.config.PropertyConfig;
import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJmsSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController)ctx.getBean("myController");

		System.out.println("----- fake data source");
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());

		System.out.println("----- fake JMS data source");
		FakeJmsSource fakeJmsSource = ctx.getBean(FakeJmsSource.class);
		System.out.println(fakeJmsSource.getUsername());
		System.out.println(fakeJmsSource.getPassword());

//		System.out.println("----- Profile");
//		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
//		System.out.println(i18nController.sayHello());
//
//		System.out.println("----- Primary");
//		System.out.println(myController.sayHello());
//
//		System.out.println("----- Property");
//		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
//		System.out.println(propertyInjectedController.getGreeting());
//
//		System.out.println("----- Setter");
//		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
//		System.out.println(setterInjectedController.getGreeting());
//
//		System.out.println("----- Constructor");
//		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
//		System.out.println(constructorInjectedController.getGreeting());


	}

}
