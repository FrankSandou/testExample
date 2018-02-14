package tsum.features;

import tsum.features.steps.HomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)

public class WhenCorrectRegistration {

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
    public void CorrectRegistration() {


        HP.loginPageOpen();
        HP.openRegistration();
        HP.inputValueinField("testR","REGISTER[NAME]");
        HP.inputValueinField("test1234@test.test","REGISTER[EMAIL]");
        HP.inputValueinField("+79001234455","REGISTER[PERSONAL_PHONE]");
        HP.inputValueinField("test123","REGISTER[PASSWORD]");
        HP.RegistrationButtonClick();
        HP.checkLoginName("testR");

    }
}