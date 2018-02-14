package tsum.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import tsum.features.steps.HomePage;

@RunWith(SerenityRunner.class)

public class WhenWrongRegistration {

    @Steps
    private HomePage HP;

    @Managed(
            driver = "chrome"
    )

    WebDriver browser;
    @Before
    public void setUp() {
        browser.manage().window().maximize();
    }
    @Test
    public void WhenWrongRegistration() {


        HP.loginPageOpen();
        HP.openRegistration();
        HP.RegistrationButtonClick();
        HP.checkErrorByField("Введите имя","REGISTER[NAME]");
        HP.checkErrorByField("Введите email","REGISTER[EMAIL]");
        HP.checkErrorByField("Введите номер","REGISTER[PERSONAL_PHONE]");
        HP.checkErrorByField("Введите пароль","REGISTER[PASSWORD]");



    }
}