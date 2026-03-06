package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class User {

    @Test(groups = {"user"})
    public void userModule() {
        System.out.println("Running user module");
    }

}
