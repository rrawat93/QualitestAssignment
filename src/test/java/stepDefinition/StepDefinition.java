package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.CartPage;
import pageClasses.HomePage;
import pageClasses.WishlistPage;
import helper.BrowserManager;
import helper.Screenshots;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class StepDefinition extends BrowserManager {
    CartPage cartPage;
    HomePage homePage ;
    WishlistPage wishlistPage;

    @Given("I add four different product to my wish list")
    public void i_add_four_different_product_to_my_wish_list() {
        homePage=new HomePage(driver);
        homePage.addItemsToWishlist();
    }

    @When("I view my wishlist table")
    public void i_view_my_wishlist_table() {
        homePage=new HomePage(driver);
        homePage.clickOnWishlist();
    }

    @Then("I find total four selected items in my wishlist")
    public void i_find_total_four_selected_items_in_my_wishlist() {
        wishlistPage=new WishlistPage(driver);
        assertEquals(wishlistPage.countItemInList(), 4);
    }

    @When("I search for lowest price product")
    public void i_search_for_lowest_price_product() {
        wishlistPage= new WishlistPage(driver);
        wishlistPage.findLowestPriceItem(driver);
    }

    @When("I am able to add the lowest price item to my cart")
    public void i_am_able_to_add_the_lowest_price_item_to_my_cart() {
        wishlistPage= new WishlistPage(driver);
        wishlistPage.verifyDisplayedConfirmationText(driver);
    }

    @Then("I am able to verify the item in my cart")
    public void i_am_able_to_verify_the_item_in_my_cart() {
        cartPage= new CartPage(driver);
        cartPage.verifyCart();

    }

    @Then("^user take screenshot$")
    public void I_take_screenshot() throws IOException {

        Screenshots screen = new Screenshots();

        screen.takeScreenShot(driver);
    }

}
