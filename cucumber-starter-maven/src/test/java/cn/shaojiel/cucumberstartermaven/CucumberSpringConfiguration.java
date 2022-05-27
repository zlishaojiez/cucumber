package cn.shaojiel.cucumberstartermaven;

import io.cucumber.spring.CucumberContextConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;


@ComponentScan("cn.shaojiel.cucumberstartermaven")
@TestPropertySource("classpath:config.properties")
@Slf4j
public class CucumberSpringConfiguration {


}
