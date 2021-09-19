import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Calculator {
    AndroidDriver driver;

    @BeforeTest

    public void setUp() throws MalformedURLException{

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("version", "8.1");
        capabilities.setCapability("deviceName", "AtosTestEmulator");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        capabilities.setCapability("orientation", "PORTRAIT");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @Test
    public void RoadRunner() throws MalformedURLException, InterruptedException {


        //driver.findElement(By.id("com.tricolorcat.calculator:id/btOK")).click();

        //  eq: 58+12-21*19

        driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();

        driver.findElement(By.id("com.android.calculator2:id/op_add")).click();

        driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();

        driver.findElement(By.id("com.android.calculator2:id/op_sub")).click();

        driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();

        driver.findElement(By.id("com.android.calculator2:id/op_mul")).click();

        driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();

        driver.findElement(By.id("com.android.calculator2:id/eq")).click();

/*
        String result ="-329";
        Assert.assertEquals(driver.findElement(By.id("com.android.calculator2:id/result")).getText(),result);
*/
    }
    @AfterTest
    public void End() {
        driver.quit();
    }}
