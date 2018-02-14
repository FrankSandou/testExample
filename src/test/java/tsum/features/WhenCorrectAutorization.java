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

public class WhenCorrectAutorization {

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
    public void CorrectAutorization() {
        HP.loginPageOpen();
        HP.inputValueinField("iwanowiw@gmail.com","email");
        HP.inputValueinField("test123","password");
        HP.entrance();
        HP.checkLoginName("Фрэнк");


    }
}