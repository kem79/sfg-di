package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJmsSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("spring")
@Configuration
public class SpringBootPropertyConfig {

    @Value("${guru.username}")
    String user;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl")
    String dburl;

    @Value("${guru.jms.username}")
    String jmsUserName;

    @Value("${guru.jms.password}")
    String jmsPassword;

    @Value("${guru.jms.url}")
    String jmsUrl;

    @Bean
    FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setDburl(dburl);
        return fakeDataSource;
    }

    @Bean
    FakeJmsSource fakeJmsSource(){
        FakeJmsSource fakeJmsSource = new FakeJmsSource();
        fakeJmsSource.setUsername(jmsUserName);
        fakeJmsSource.setPassword(jmsPassword);
        fakeJmsSource.setJmsUrl(jmsUrl);
        return fakeJmsSource;
    }
}
