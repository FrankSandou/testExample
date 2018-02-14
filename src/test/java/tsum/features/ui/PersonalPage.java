package tsum.features.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.tsum.ru/")
public class PersonalPage extends PageObject {
    public void login()  {

       find(By.xpath("//a[@data-popup='login']")).click();

        //$("#username").sendKeys("admin@decohere.com");
        //$("#password").sendKeys("admin");

       // $("#login").click();
    }
}