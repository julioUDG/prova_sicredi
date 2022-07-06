package pages;

import org.openqa.selenium.WebDriver;

public class BaseNavegadorPage {
    protected WebDriver navegador;

    public BaseNavegadorPage(WebDriver navegador) {
        this.navegador = navegador;
    }
}
