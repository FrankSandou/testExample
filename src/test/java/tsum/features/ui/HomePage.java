package tsum.features.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.support.FindBy;

import static java.util.concurrent.TimeUnit.SECONDS;

@DefaultUrl("https://www.tsum.ru/")
public class HomePage extends PageObject {
    public void openLoginPage()  {

       find(By.xpath("//a[@data-popup='login']")).click();

    }
    public void openRegistration()  {

        find(By.xpath("//a[@data-popup='reg']")).withTimeoutOf(5, SECONDS).waitUntilClickable().click();

    }
    public void inputValueinField(String Value,String Field)  {

        find(By.xpath("//input[@name='"+Field+"']")).withTimeoutOf(5, SECONDS).waitUntilClickable().type(Value);

    }
    public void entrance()  {

        find(By.xpath("//div[@data-type='login']/div/form/div[@class='popup__button']/button")).withTimeoutOf(5, SECONDS).waitUntilClickable().click();

    }

    public String getLoginName()  {

        return    find(By.xpath("//a[@href='/personal/profile/']")).withTimeoutOf(5, SECONDS).waitUntilClickable().getText();

    }

    public String getFieldWrongText(String field)  {

        return    find(By.xpath("//div/input[@name='"+field+"']/..")).withTimeoutOf(5, SECONDS).waitUntilClickable().getText();

    }

    public void RegistrationButtonClick()  {

        find(By.xpath("//div[@data-type='reg']/div/form/div[@class='popup__button']/button")).withTimeoutOf(5, SECONDS).waitUntilClickable().click();

    }
}