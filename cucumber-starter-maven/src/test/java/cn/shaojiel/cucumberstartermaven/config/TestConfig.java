package cn.shaojiel.cucumberstartermaven.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestConfig {
    @Bean
    public String testBean() {
        return "testBean";
    }
}
