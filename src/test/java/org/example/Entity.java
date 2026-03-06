package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Entity {
    @Test(groups = {"entity"})
    public void entityModule() {
        System.out.println("Running entity module");
    }
}
