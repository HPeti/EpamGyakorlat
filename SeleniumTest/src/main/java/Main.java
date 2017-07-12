import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Scanner;

/**
 * Created by Peter_Hegedus2 on 7/10/2017.
 */
public class Main {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        browserChoose(scanner.nextLine());
        driver.get("https://www.google.hu");
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(driver.getTitle());
        WebElement element = driver.findElement(By.cssSelector("input[id='lst-ib']"));
        element.sendKeys("Cheese!");
        element.submit();

    }
    public static WebDriver driver;
    public static void browserChoose(String browserName)
    {
        switch (browserName)
        {
            case "Chrome":
            {

                driver= new ChromeDriver();
                break;
            }
            case "Firefox":
            {
                driver= new FirefoxDriver();
                break;
            }
            case "Explorer":
            {
                driver= new InternetExplorerDriver();
                break;
            }
            default:
            {
                throw new RuntimeException("Rossz böngészőnév");
            }
        }
    }
}
