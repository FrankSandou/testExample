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

public class WhenWrongAutorization {

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
    public void WhenWrongAutorization() {

        HP.loginPageOpen();
     //   HP.inputValueinField("iwanowiw@gmail.com","email");
     //   HP.inputValueinField("test","password");
        HP.entrance();
        HP.checkErrorByField("Введите email","email");
        HP.checkErrorByField("Введите пароль","password");



    }
}