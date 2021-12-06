package co.com.simetrik.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://www.google.com.co")
public class HomePage extends PageObject {

    @FindBy(xpath = "//*[@title='Buscar']")
    WebElement inputGoogle;

    @FindBy(xpath = "//h3[contains(text(),'Simetrik')]")
    WebElement searchRestult;

    public void clickOnInput(){
        inputGoogle.click();
    }

    public void enterWord(String simetrik){
        inputGoogle.sendKeys(simetrik);
        inputGoogle.sendKeys(Keys.ENTER);
    }

    public void wordResult() throws Exception {
        List<WebElement> elements = searchRestult.findElements(By.xpath("//h3[contains(text(),'Simetrik')]"));
        System.out.println(elements.size());

        if (elements.size() != 0){
            System.out.println("successful");
        }
        else {
            throw new Exception("failed 0 results");
        }

    }
}
