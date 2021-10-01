package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage {

    SearchBox searchBox ;
    By cartCountLocator = By.id("spanCart");




    By loginbutton =By.id("header-user-section");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 2 ;
    }



    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }



    public void buttonclick(){
        click(loginbutton);
    }



}
