package de.ait_tr.qa25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeworkTestFindElements {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void findElementByCssTest() {
        driver.findElement(By.cssSelector("#dialog-notifications-success"));
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector(".master-wrapper-page"));
        driver.findElement(By.cssSelector(".header"));
        driver.findElement(By.cssSelector("[class*='ui-autocomplete-input']"));
        driver.findElement(By.cssSelector(".ajax-loading-block-window"));
        driver.findElement(By.cssSelector("[class^='search-box-text']"));
        driver.findElement(By.cssSelector("[name='description']"));
        driver.findElement(By.cssSelector("[href='/Themes/DefaultClean/Content/styles.css']"));
        driver.findElement(By.cssSelector("body:nth-child(2) div.master-wrapper-page:nth-child(4) div.master-wrapper-content > div.master-wrapper-main:nth-child(5)"));

    }

    @Test
    public void findElementByXpathTest() {
        driver.findElement(By.xpath("//div[@id='dialog-notifications-error']"));
        driver.findElement(By.xpath("//div[@id='bar-notification']"));
        driver.findElement(By.xpath("//body/div[2]"));
        driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]"));
        driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[3]"));
        driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        driver.findElement(By.xpath("//head/meta[2]"));
        driver.findElement(By.xpath("//head/link[2]"));
        driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[4]"));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
