package helpers;

import org.openqa.selenium.By;

public class Locators {
    By addFirstItem =  By.xpath("(//li[1]/div/div[2]/div/div/a)[1]");
    By addSecondItem = By.xpath("(//li[2]/div/div[2]/div/div/a)[1]");
    By addThirdItem = By.xpath("(//li[3]/div/div[2]/div/div/a)[1]");
    By addFourthItem = By.xpath("(//li[4]/div/div[2]/div/div/a)[1]");
    By checkWishList = By.xpath("//*[@class='header-wishlist']");
    By tableItems = By.xpath("//*[@class='wishlist-items-wrapper']/tr");
    By price = By.xpath("//*[@class='wishlist-items-wrapper']//*[@class='product-price']");
    By message = By.xpath("//*[@id=\"yith-wcwl-form\"]/div[1]/div");
    By openCart = By.xpath("//*[@id=\"blog\"]/div[1]/div[1]/div/div/div[3]/div[1]/div/div/a/div");
    By checkCart = By.xpath("//*[@id='site-content']/div/div/article/div/div/div[1]/div/form/table/tbody/tr[1]/td[3]/a");

}
