package com.lseg.selenium.homework17;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Homework17 {
    private WebDriver driver;

    private ChromeOptions options;

    private Wait wait;

    @BeforeClass
    public void setup1() {
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tatus\\AppData\\Local\\Google\\Chrome\\chromedriver.exe");
        System.out.println("BeforeMethod");
        options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

    }

    @AfterMethod
    public void closeEverything() {
        driver.close();
    }

    @Test
    public void calculatePercentage() {
        navigate("https://www.calculator.net/percent-calculator.html");

        WebElement input1 = new WebDriverWait(driver, 3)
                .until(d -> find(By.id("cpar1")));
        input1.sendKeys("19");
        sleep(1000);

        find(By.id("cpar2")).sendKeys("35000");
        sleep(1000);

        find(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td/input[2]")).click();
        String actualValue = find(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();

        assertEquals(actualValue, "6650");

    }

    @Test
    public void calculatePercentageDifference() {
        navigate("https://www.calculator.net/percent-calculator.html");

        find(By.name("c3par1")).sendKeys("4500");
        sleep(1000);

        find(By.name("c3par2")).sendKeys("3825");
        sleep(1000);

        find(By.xpath("//*[@id=\"content\"]/table[5]/tbody/tr[3]/td/input[2]")).click();
        String actualValue1 = find(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();
        assertEquals(actualValue1, "16.216216216216%");

        String actualValue2 = find(By.xpath("//*[@id=\"content\"]/p[4]/font/b")).getText();
        assertEquals(actualValue2, "15%");

    }

    @Test
    public void calculatePercentageIncrease() {
        navigate("https://www.calculator.net/percent-calculator.html");

        find(By.name("c2par1")).sendKeys("9000");
        sleep(1000);

        find(By.name("c2type")).sendKeys("Increase");
        sleep(1000);

        find(By.name("c2par2")).sendKeys("35");
        sleep(1000);

        find(By.xpath("//*[@id=\"content\"]/table[6]/tbody/tr[2]/td/input[2]")).click();
        String actualValue = find(By.xpath("//*[@id=\"content\"]/p[3]/font/b")).getText();
        assertEquals(actualValue, "12150");

    }

    @Test
    public void calculatePercentageDecrease() {
        navigate("https://www.calculator.net/percent-calculator.html");

        find(By.name("c2par1")).sendKeys("9000");
        sleep(1000);

        find(By.name("c2type")).sendKeys("Decrease");
        sleep(1000);

        find(By.name("c2par2")).sendKeys("35");
        sleep(1000);

        find(By.xpath("//*[@id=\"content\"]/table[6]/tbody/tr[2]/td/input[2]")).click();
        String actualValue = find(By.xpath("//*[@id=\"content\"]/p[3]/font/b")).getText();
        assertEquals(actualValue, "5850");

    }

    private WebElement find(By by) {
        return driver.findElement(by);
    }

    private void navigate(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }


    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
