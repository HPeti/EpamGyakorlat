package Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Peter_Hegedus2 on 7/13/2017.
 */
public class Screenshot {
    public void getScreenshot(WebDriver driver) throws Exception {
        Date date = new Date();
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String stringDate=simpleDate.format(date);
        FileUtils.copyFile(scrFile, new File("C:/Users/Peter_Hegedus2/Desktop/Programs/SeleniumGmailLogin/src/Screenshots/screenshot_"+stringDate+".png"));
    }
}
