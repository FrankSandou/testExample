package tsum.features.steps;

import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class HomePage {
    private tsum.features.ui.HomePage HomePage;

    @Step
    public void loginPageOpen(){
        HomePage.open();

        HomePage.openLoginPage();
    }
    @Step
    public void openRegistration(){
        HomePage.openRegistration();
    }
    @Step
    public void inputValueinField(String Value,String Field){
        HomePage.inputValueinField(Value,Field);
    }
    @Step
    public void entrance(){
        HomePage.entrance();
    }

    @Step
    public void checkLoginName(String Value){

        assertThat(HomePage.getLoginName()).isEqualTo(Value);

    }
    @Step
    public void checkErrorByField(String Value,String Field){
System.out.println(HomePage.getFieldWrongText(Field));
        assertThat(HomePage.getFieldWrongText(Field)).isEqualTo(Value);

    }
    @Step
    public void RegistrationButtonClick(){
        HomePage.RegistrationButtonClick();
    }


}