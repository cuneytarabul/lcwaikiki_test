package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBox extends BasePage{

    By searchBoxLocator = By.id("search");

    WebElement textarea =driver.findElement(By.id("search"));


    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator , text);
        textarea.sendKeys(Keys.ENTER);
    }
}