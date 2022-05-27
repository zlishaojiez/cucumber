package cn.shaojiel.cucumberstartermaven;

import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.ConfigurationParameters;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;


import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

//import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("cn/shaojiel/cucumberstartermaven/features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "cn.shaojiel.cucumberstartermaven")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, json:target/report/cucumber.json")
@CucumberContextConfiguration
@SpringBootTest(classes = CucumberSpringConfiguration.class)
public class RunCucumberTest {


}
