package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{

    By addToCartButtonLocator = By.id("pd_add_to_cart");

    By addToCartSizeDetailsLocator = new By.ByCssSelector("a[size]");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocator);
    }



    public void addToSizeDetail() {
        click(addToCartSizeDetailsLocator);
    }

    public void addToCart() {
        click(addToCartButtonLocator);
    }
}
