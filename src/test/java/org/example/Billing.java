package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Billing {

    @Test(groups = {"billing"})
    public void billingModule() {
        System.out.println("Running billing module");
    }
}
