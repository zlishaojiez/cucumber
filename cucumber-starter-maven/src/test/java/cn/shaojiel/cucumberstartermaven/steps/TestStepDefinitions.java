package cn.shaojiel.cucumberstartermaven.steps;

import io.cucumber.java.en.Given;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class TestStepDefinitions {
    @Autowired
    private String testBean;

    @Given("background")
    public void background() {
        log.info("**********************");
        log.info("background");
        log.info("**********************");
    }

    @Given("I am {string}")
    public void who_am_i(String name) {
        log.info("===========================");
        log.info("I am {} {}", name, testBean);
        log.info("===========================");
    }
}
