package mouseAndKeyOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OperationMouseHover {
    @Test
    public void mouseHover() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        WebElement homeAndFurniture = driver.findElement(By.xpath("//span[@class=\"_1XjE3T\"]//span[contains(text(),\"Home & Furniture\")]"));
        Actions action = new Actions(driver);
        action.moveToElement(homeAndFurniture).perform();
        Thread.sleep(3000);
        action.click(driver.findElement(By.linkText("Furniture"))).perform();
        Thread.sleep(3000);
        driver.quit();



    }
}
