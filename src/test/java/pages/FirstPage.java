package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class FirstPage {

    public FirstPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "https://")
    public WebElement ayarlar;


}
