package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class CartPage {
    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.XPATH, using = "(//*[@class='la la-shopping-bag'])[1]")
    private WebElement openCart;

    @FindBy(how = How.XPATH, using = "(//*[@class='product-name'])[2]")
    private WebElement checkCart;


    public void verifyCart() {

        try{

            openCart.click();
           checkCart.click();
           System.out.println("end of test");

        }catch (Exception e)
        {
            e.printStackTrace();

        }

    }
}
