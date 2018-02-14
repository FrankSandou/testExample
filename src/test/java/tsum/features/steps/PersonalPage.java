package tsum.features.steps;

import net.thucydides.core.annotations.Step;

public class PersonalPage {
    private tsum.features.ui.HomePage HomePage;
    @Step
    public void loginPageOpen(){
        HomePage.open();

        HomePage.openLoginPage();
    }

}