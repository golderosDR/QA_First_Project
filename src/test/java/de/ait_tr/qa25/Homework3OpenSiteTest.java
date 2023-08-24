package de.ait_tr.qa25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework3OpenSiteTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com");//without history

    }
    @Test
    public void openGoogleTest() {
        System.out.println("Site opened successfully!!!");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
