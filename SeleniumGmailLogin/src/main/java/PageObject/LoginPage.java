package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sun.rmi.runtime.Log;

/**
 * Created by Peter_Hegedus2 on 7/13/2017.
 */
public class LoginPage {
    private static WebElement element;
    private static WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement emailOrPhone() {
        element = driver.findElement(By.id("identifedId"));
        return element;
    }

    public static WebElement password() {
        element = driver.findElement(By.cssSelector(".whsOnd.zHQkBf"));
        return element;
    }

    public static WebElement nextButton() {
        element = driver.findElement(By.cssSelector(".ZFr60d.CeoRYc"));
        return element;
    }

    public static WebElement errorMesseage() {
        element = driver.findElement(By.cssSelector(".dEOOab.RxsGPe"));
        return element;
    }

    public static WebElement languageChooser() {
        element = driver.findElement(By.xpath(".//*[@id='lang-chooser']/div[1]/div[2]/div"));
        return element;
    }

    public static WebElement forgotEmail() {
        element = driver.findElement(By.cssSelector(".uBOgn"));
        return element;
    }

    public static WebElement help() {
        element = driver.findElement(By.xpath(".//*[@id='initialView']/footer/ul/li[1]/a"));
        return element;
    }

    public static WebElement privacy() {
        element = driver.findElement(By.xpath(".//*[@id='initialView']/footer/ul/li[2]/a"));
        return element;
    }

    public static WebElement terms() {
        element = driver.findElement(By.xpath(".//*[@id='initialView']/footer/ul/li[3]/a"));
        return element;
    }
}
