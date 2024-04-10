package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.WebJumpPage;

public class AccessPageStep extends BaseClass {
    private final WebJumpPage wj = new WebJumpPage(driver);


    @And("User access page")
    public void userAccessPage() {
        logger.info("Accessing search page");
    }

    @And("User waits for cookie consent")
    public void userWaitsCookieConsent(){
        logger.info("User waits for cookie consent");

    }


    @When("user clicks on button one")
    public void userClicksOnBtnOne() {
        logger.info("Filling out the form");
        wj.btnOneClick();

    }

    @When("user clicks on button two")
    public void userClicksOnBtnTwo(){
        wj.btnTwoClick();
    }

    @When("user clicks on button three")
    public void userClicksOnBtnThree() throws InterruptedException {
        wj.btnThreeClick();
    }
}
//    @When("I fill in the login form with the data email {string} and password {string}")
//    public void iFillInTheLoginFormWithTheDataEmailAndPassword(String email, String password) {
//        logger.info("Filling out the form");
//        lp.btnOneClick(email, password);
//    }

