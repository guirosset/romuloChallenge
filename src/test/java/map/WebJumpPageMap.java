package map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class WebJumpPageMap extends BasePage {
    public WebJumpPageMap(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "btn_one")
    WebElement btnOne;

    @FindBy(id = "btn_two")
    WebElement btnTwo;


    public WebElement getBtnOne() {
        return btnOne;
    }

    public WebElement getBtnTwo() {
        return btnTwo;
    }

//    public void clickBtnSignIn() {
//        clickJS(btnSignIn);
    }

