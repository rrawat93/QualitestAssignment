package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QualitestAssignmentHelper {
   WebDriver driver;
    Locators locators= new Locators();

    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://testscriptdemo.com/");
        driver.manage().window().maximize();
    }

    public void addItemsToWishlist() {
        try {

            driver.findElement(locators.addFirstItem).click();
            driver.findElement(locators.addSecondItem).click();
            Thread.sleep(5000);
            driver.findElement(locators.addThirdItem).click();
            driver.findElement(locators.addFourthItem).click();

        } catch (Exception e) {
            e.printStackTrace();
            //driver.quit();
        }

    }

    public void clickOnWishlist(){
        driver.findElement(locators.checkWishList).click();

    }

    public int countItemInList(){
       return driver.findElements(locators.tableItems).size();
    }

    public void findLowestPriceItem()
    {
        try{
        List<WebElement> productPrice = driver.findElements(locators.price);
        List<String> allValues = new ArrayList<>();
        for(int i=0;i<productPrice.size();i++) {
            String [] l1= productPrice.get(i).getText().replace("-", "").split(" ");
            for(int j=0; j<l1.length; j++){
                allValues.add(l1[j].replace("£", ""));
            }
            Collections.sort(allValues);
        }
        driver.findElement(By.xpath("//*[contains(text(),'"+allValues.get(0)+"')]//following::td[2]")).click();
        Thread.sleep(1000);
    }catch (Exception e)
    {
        e.printStackTrace();
        driver.quit();
    }
    }

    public void verifyDisplayedConfirmationText() {
        try{
            Thread.sleep(1000);
            driver.findElement(locators.message).isDisplayed();
        }catch (Exception e){
            e.printStackTrace();
            driver.quit();
        }

    }


    public void verifyCart() {

        try{

            driver.findElement(locators.openCart).click();
            driver.findElement(locators.checkCart).click();
            driver.quit();
        }catch (Exception e)
        {
            e.printStackTrace();
            driver.quit();
        }
        driver.quit();
    }

}
