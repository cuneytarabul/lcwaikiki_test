import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.*;

public class Test_Add_Product_To_Cart extends BaseTest {

    HomePage homePage ;
    ProductsPage productsPage ;
    ProductDetailPage productDetailPage ;
    CartPage cartPage ;
    loginPage LoginPage;
    SearchBox searchBox;


    @Test
    @Order(1)

    public void login() {
        homePage = new HomePage(driver);
        homePage.buttonclick();
        LoginPage= new loginPage(driver);
        LoginPage.setmail("potoki1024@bio123.net");
        LoginPage.setPass("C.3070");
        LoginPage.girislink();

productsPage =new ProductsPage(driver);

      



    }

    @Test
    @Order(2)

    public void search_a_product() throws InterruptedException {
        homePage = new HomePage(driver);

        productsPage = new ProductsPage(driver);


        homePage.searchBox().search("Pantolon");

        productsPage.scrollPageDown();
        productsPage.dahafazla();


    }

    @Test
    @Order(3)
    public void select_a_product(){
        productsPage =new ProductsPage(driver);
        productsPage.selectProduct(1);

    }

    @Test
    @Order(4)
    public void add_product_to_cart(){
        productDetailPage = new ProductDetailPage(driver);

        productDetailPage.addToSizeDetail();
        productDetailPage.addToCart();

        Assertions.assertTrue(homePage.isProductCountUp(), "Product count did not increase!");

    }

    @Test
    @Order(5)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        cartPage.setGotoCartLocator();
        cartPage.setAddedLocator();

        cartPage.delete_Cart();




    }




}