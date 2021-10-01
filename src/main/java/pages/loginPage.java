package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class loginPage extends BasePage {
    private By email = By.id("LoginEmail");
    private By pass= By.id("Password");
    private By giris = By.id("loginLink");


    public loginPage(WebDriver driver) {
        super(driver);
    }
    public void setmail(String emailText){
        WebElement emailSpace = driver.findElement(email);
        emailSpace.click();
        emailSpace.sendKeys(emailText);
    }
    public void setPass(String passtext){
        WebElement passSpace = driver.findElement(pass);
        passSpace.click();
        passSpace.sendKeys(passtext);
    }
    public void girislink(){
        click(giris);
    }




}
