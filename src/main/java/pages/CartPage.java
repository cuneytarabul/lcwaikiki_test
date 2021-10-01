package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CartPage extends BasePage {

    By productNameLocator = new By.ByCssSelector("a.a-link-normal span.a-size-medium ");
    By addedLocator = By.id("Cart_AddQuantity_676074503");

    By gotoCartLocator =new By.ByCssSelector("a.header-cart");
    By cartCountLocator = By.id("spanCart");
    By deleteCart = By.id("Cart_ProductDelete_676074503");
    By deleteCart_two = By.id("Cart_ProductFavAndDelete_676074503");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductAdded() {
        return getProducts().size() > 2 ;
    }

    private List<WebElement> getProducts(){
        return findAll(productNameLocator);
    }

    public void setAddedLocator(){
        click(addedLocator);
    }
    public void setGotoCartLocator(){
        click(gotoCartLocator);
    }
    public boolean isProductCountUp(){

        return getCartCount()>2;
    }

    private int getCartCount(){

        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }
    public void delete_Cart(){
        click(deleteCart);
    }
    public void delete_Cart_two(){
        click(deleteCart_two);
    }

}