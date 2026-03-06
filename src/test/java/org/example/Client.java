package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Client {

    @Test(groups = {"client"})
    public void clientModule() {
        System.out.println("Running client module");
    }

}
