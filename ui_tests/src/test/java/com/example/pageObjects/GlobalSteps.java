package com.example.pageObjects;

import com.example.TestsConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static com.example.CucumberHooks.getDriver;

/**
 * This class contains global (common) steps that do not belong to any specific page
 * As well as all the entry points into the system (open a url)
 */
public class GlobalSteps {
    @When("I open start page")
    public ExamplePage iOpenDashboardPage() throws InterruptedException {
//        Base URL is read from config.properties file located in resources folder. Key is base.url
        String baseUrl = TestsConfig.getConfig().getBaseUrl();
        getDriver().get(baseUrl);
        Thread.sleep(4000);
        return new ExamplePage();
    }

    @When("sleep")
    public void sleep() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Given("index page opened")
    public void typeHello(){
        String baseUrl = "https://letskodeit.teachable.com/p/practice";
        getDriver().get(baseUrl);
    }
}
