package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "(//li[1]/div/div[2]/div/div/a)[1]")
    private WebElement addFirstItem;

    @FindBy(how = How.XPATH, using = "(//li[2]/div/div[2]/div/div/a)[1]")
    private WebElement addSecondItem;

    @FindBy(how = How.XPATH, using = "(//li[3]/div/div[2]/div/div/a)[1]")
    private WebElement addThirdItem;

    @FindBy(how = How.XPATH, using = "(//li[4]/div/div[2]/div/div/a)[1]")
    private WebElement addFourthItem;

    @FindBy(how = How.XPATH, using = "(//*[@class='header-wishlist'])[1]")
    private WebElement checkWishList;


    public void addItemsToWishlist() {
        try {
            addFirstItem.isDisplayed();
            addFirstItem.click();
            addSecondItem.isDisplayed();
            addSecondItem.click();
            addThirdItem.isDisplayed();
            addThirdItem.click();
            addFourthItem.isDisplayed();
            addFourthItem.click();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void clickOnWishlist(){
        try {
            checkWishList.click();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
