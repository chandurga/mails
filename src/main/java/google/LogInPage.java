package google;

import com.codeborne.selenide.Selenide;

public class LogInPage {


    public void openBrowser(){
        Selenide.open("http://google.com");
    }
}
