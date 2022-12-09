package Selenium;/*
User: srik
Description: Automating NoBroker website
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

public class No_Broker {
    //private static By driver;
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Installations\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.nobroker.in/");
        driver.manage().window().maximize();
        //WebDriverWait wait = new WebDriverWait(driver,6);
        Thread.sleep(3000);

        boolean no_broker_logo = driver.findElement(By.xpath("//*[@id=\"navHeader\"]/div[2]/div/img")).isDisplayed();
        if (no_broker_logo == true) {
            WebElement login = driver.findElement(By.xpath("//nav[@id='navHeader']/div[5]/div[2]/div[2]/div"));
            login.click();

            // It will return the parent window name as a String
            String parent = driver.getWindowHandle();
            Set<String> s = driver.getWindowHandles();
            Iterator<String> I1 = s.iterator();
            while (I1.hasNext()) {
                String child_window = I1.next();
                if (!parent.equals(child_window)) {
                    driver.switchTo().window(child_window);
                    Thread.sleep(2000);
                    WebElement mob_number = driver.findElement(By.xpath("//*[@id=\"signUp-phoneNumber\"]"));
                    mob_number.sendKeys("9391543487");


                    WebElement whatsapp = driver.findElement(By.id("nb-switch-toggle xs"));
                    whatsapp.click();


                }
            }
        }
    }
}
