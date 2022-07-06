package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class addTemaPage extends BaseNavegadorPage {


    public addTemaPage(WebDriver navegador) {
        super(navegador);
    }

    public addRecordPage EscolherTema() {
        WebElement teste = navegador.findElement(By.id("switch-version-select"));
        new Select(teste).selectByVisibleText("Bootstrap V4 Theme");

        return new addRecordPage(navegador);
    }
}
