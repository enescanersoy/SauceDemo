package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
    WebDriver driver;
    util.ElementHelper elementHelper;
    WebDriverWait wait;

    By loginButton = By.cssSelector("#login-button");
    By errorMessage = By.cssSelector("h3[data-test='error']");
    By usernameBox = By.cssSelector("#user-name");
    By passwordBox = By.cssSelector("#password");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new util.ElementHelper(driver);

    }
    public void userAtLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }


    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void checkMessage(String username) {
        elementHelper.checkVisible(errorMessage);
    }


    public void writeUsernameForUsernameField(String id) {
        driver.findElement(usernameBox).click();
        elementHelper.sendKey(usernameBox,"abcdef");

    }

    public void writePasswordForPwField(String pw) {
        driver.findElement(passwordBox).click();
        elementHelper.sendKey(passwordBox,"123123");

    }

    public void correctUsername(String correctUsername) {
        driver.findElement(usernameBox).click();
        elementHelper.sendKey(usernameBox,"standard_user");
    }

    public void wrongPassword(String wrongPw) {
        driver.findElement(passwordBox).click();
        elementHelper.sendKey(passwordBox,"123123");
    }


    public void correctPassword(String correctPw) {
        driver.findElement(passwordBox).click();
        elementHelper.sendKey(passwordBox,"secret_sauce");
    }

    public void wrongUsername(String wrongUsername) {
        driver.findElement(usernameBox).click();
        elementHelper.sendKey(usernameBox,"enescanersoy");
    }
}
