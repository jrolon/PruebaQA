package co.com.simetrik.steps;


import co.com.simetrik.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class SimetrikHomePage {

    HomePage homePage;
        @Step
        public void openSimetrikPage(){
            homePage.open();
        }
        @Step
        public void enterTheWorldSearch(String simetrik){
            homePage.clickOnInput();
            homePage.enterWord(simetrik);
        }
        @Step
        public void result() throws Exception {
            homePage.wordResult();
        }

}
