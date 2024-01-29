package testiniumHomeWork.Base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BasePage {
    WebDriver driver=null;
    WebDriverWait wait=null;
    public BasePage(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(60));
    }
    public WebElement findElement(By by)
    {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }
    public List<WebElement> findElements(By by)
    {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElements(by);
    }
    public void hover(By by)
    {
        Actions actions=new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }
    public void click(By by) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }
    public void checkselected(By by)
    {
        Assert.assertEquals("Default selected section is not \"otel\"","custom-icon",findElement(by).getAttribute("data-role"));
    }
    public void checkurl(String text)
    {
        Assert.assertEquals("Wrong url", driver.getCurrentUrl(), text);
    }
    public void writethewheretogo(By by)
    {
        findElement(by).sendKeys("antalya");
    }
    public void choosedate(By by)
    {
        findElement(by).click();
    }
    public void cheeckNumber(By by)
    {
        Assert.assertEquals(3,Integer.parseInt(findElement(by).getText()));
    }
    public void checkurlcontains(String text){
        Assert.assertFalse("URL doens't contains \"antalya\"",driver.getCurrentUrl().contains(text));
    }
    public int randomchooseforarea(By by)
    {
        List<WebElement> items= findElements(by);
        Random rand = new Random();
        WebElement selected=items.get(rand.nextInt(items.size()));
        selected.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor='yellow';", selected);
        int number=Integer.parseInt(selected.getText().substring((selected.getText().lastIndexOf("(")+1), selected.getText().lastIndexOf(")")));
        return number;
    }
    public void checknumber(int number,By by) throws InterruptedException
    {
        if(number>=21)
        {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", findElement(by));
            Thread.sleep(2000);
            Assert.assertEquals("The numbers are not equals",number,Integer.parseInt(findElement(by).getText()));
        }
        else
        {
            System.out.println("The number is lover then 20 so the referance number doesn't visibile.");
        }
    }
}
