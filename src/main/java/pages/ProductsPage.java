package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {



    By dahafazlaLocator =new By.ByCssSelector("a.lazy-load-button");
    By productNameLocator = new By.ByCssSelector("div[class*=pic]");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }



    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
    public void scrollPageDown() throws InterruptedException {
       JavascriptExecutor jse =(JavascriptExecutor) driver;

       jse.executeScript("window.scrollBy(0,7000);");
       Thread.sleep(5000);

    }
    public void dahafazla(){
        click(dahafazlaLocator);
    }

}