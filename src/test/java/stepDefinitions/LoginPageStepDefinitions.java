package stepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;


public class LoginPageStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("User at login page")
    public void userAtLoginPage() {
        loginPage.userAtLoginPage();
    }
    @When("Click login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }
    @Then("Check {string} message about username")
    public void checkMessageAboutUsername(String username) {
        loginPage.checkMessage(username);
    }
    @When("Entered {string} for username field")
    public void enteredForUsernameField(String id) {
        loginPage.writeUsernameForUsernameField(id);
    }
    @Then("Check {string} message about password")
    public void checkMessageAboutPassword(String password) {
        loginPage.checkMessage(password);
    }
    @When("Entered {string} for password field")
    public void enteredForPasswordField(String pw) {
        loginPage.writePasswordForPwField(pw);
    }
    @When("write Correct {string} for username field")
    public void writeCorrectForUsernameField(String correctUsername) {
        loginPage.correctUsername(correctUsername);
    }
    @When("write Wrong {string} for password field")
    public void writeWrongForPasswordField(String wrongPw) {
        loginPage.wrongPassword(wrongPw);
    }
    @Then("Check {string} message about pw don't match")
    public void checkMessageAboutPwDonTMatch(String pwDontMatch) {
       loginPage.checkMessage(pwDontMatch);
    }
    @When("write Wrong {string} for username field")
    public void writeWrongForUsernameField(String wrongUsername) {
            loginPage.wrongUsername(wrongUsername);
    }
    @When("write Correct {string} for password field")
    public void writeCorrectForPasswordField(String correctPw) {
        loginPage.correctPassword(correctPw);
    }
    @Then("Check {string} message about username don't match")
    public void checkMessageAboutUsernameDonTMatch(String usernameDontMatch) {
        loginPage.checkMessage(usernameDontMatch);
    }
    @Then("Go to Product Page")
    public void goToProductPage() {
        driver.get("https://www.saucedemo.com/inventory.html");
    }
}
