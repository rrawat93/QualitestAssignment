package stepDef;

import helpers.QualitestAssignmentHelper;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class QualitestAssignmentStepDef extends QualitestAssignmentHelper {
    @Before
    public void openURL() {
        openBrowser();
    }

    @Given("I add four different product to my wish list")
    public void i_add_four_different_product_to_my_wish_list() {
        addItemsToWishlist();
    }

    @When("I view my wishlist table")
    public void i_view_my_wishlist_table() {
        clickOnWishlist();
    }

    @Then("I find total four selected items in my wishlist")
    public void i_find_total_four_selected_items_in_my_wishlist() {
        assertEquals(countItemInList(), 4);
    }

    @When("I search for lowest price product")
    public void i_search_for_lowest_price_product() {
        findLowestPriceItem();
    }

    @When("I am able to add the lowest price item to my cart")
    public void i_am_able_to_add_the_lowest_price_item_to_my_cart() {
       verifyDisplayedConfirmationText();
    }

    @Then("I am able to verify the item in my cart")
    public void i_am_able_to_verify_the_item_in_my_cart() {
        verifyCart();

    }
}
