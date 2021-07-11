package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import helper.BrowserManager;

public class Hook extends BrowserManager {


    @Before

    public void LaunchBrowser() {

        super.initialize("chrome");

        driver.get("https://testscriptdemo.com/");
    }


    @After

    public void closeAllOpenedBrowsers(){

        driver.quit();
        System.out.println("closed all browsers");
    }
}
