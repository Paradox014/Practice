package mouseAndKeyOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class OperationUpload {
    @Test
    public void upload() throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://smallpdf.com/");
        WebElement tools = driver.findElement(By.xpath("//div[@class=\"sc-1gknlcm-0 kiOoJH\"]"));
        tools.click();
//        Select select = new Select(tools);
        WebElement compressPdf = driver.findElement(By.linkText("Compress PDF"));
        compressPdf.click();
        Thread.sleep(2000);
        WebElement chooseFile = driver.findElement(By.xpath("//span[@class=\"sc-8s01yt-4 dNifye\"]"));
        Thread.sleep(3000);
        chooseFile.click();
        //copy the file path which need to uploaded
        StringSelection filepath = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\Saraj_Maity_Resume.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);
        Thread.sleep(3000);
        //Paste file path into the upload popup to get the item
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        Thread.sleep(3000);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        Thread.sleep(4000);
        //Press Enter
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        driver.quit();

    }

}
