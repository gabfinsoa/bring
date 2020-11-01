package steps;

import capabilities.Capabilities;
import cucumber.api.Scenario;
import cucumber.api.java8.Pt;
import utils.Utils;

public class Hook implements Pt{

    public Hook() {

        Before((Scenario scenario) -> {
            System.setProperty("webdriver.chrome.driver", Utils.webdriverLocation());
            System.out.println("Base URL: " + Utils.getBaseUrl());
            System.out.println("Brand: " + Utils.getBrand());
            System.out.println("Mode: " + Utils.getMode());
            System.out.println("Env: " + Utils.getEnv());
            try {
                Capabilities.loadPage(Utils.getBaseUrl());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        After((Scenario scenario) -> {
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("Test Scenario: " + scenario.getName());
            System.out.println("Test Status: " + scenario.getStatus().toUpperCase());
            System.out.println("---------------------------------------------------------------------------------------------------");
        });


    }
}
