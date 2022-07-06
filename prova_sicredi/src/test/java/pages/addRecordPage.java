package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addRecordPage extends BaseNavegadorPage {

    public addRecordPage(WebDriver navegador) {
        super(navegador);
    }

    public formRecordPage clickAddRecord() {
        navegador.findElement(By.linkText("Add Record")).click();

        return  new formRecordPage(navegador);
    }
}
