package pages;

import map.WebJumpPageMap;
import org.openqa.selenium.WebDriver;

public class WebJumpPage extends WebJumpPageMap {
    public WebJumpPage(WebDriver driver) {
        super(driver);
    }

    public void btnOneClick() {
        getBtnOne().click();

    }

    public void btnTwoClick(){
        getBtnTwo().click();
    }

    public void btnThreeClick() throws InterruptedException {
        getBtnThree().click();
        Thread.sleep(1500);

    }
}
