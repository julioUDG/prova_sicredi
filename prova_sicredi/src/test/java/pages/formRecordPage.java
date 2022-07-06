package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

public class formRecordPage extends BaseNavegadorPage {


    public formRecordPage(WebDriver navegador) {
        super(navegador);
    }

    //  Preencher o formulário ADD Record.
    public formRecordPage preencherCustomerName(String customerName) {
        navegador.findElement(By.id("field-customerName")).sendKeys(customerName);
        return this;
    }
    public formRecordPage preenchercontactLastName(String contactLastName) {
        navegador.findElement(By.id("field-contactLastName")).sendKeys(contactLastName);
        return this;
    }

    public formRecordPage preenchercontactFirstName(String contactFirstName) {
        navegador.findElement(By.id("field-contactFirstName")).sendKeys(contactFirstName);
        return this;
    }

    public formRecordPage preencherPhone(String phone) {
        navegador.findElement(By.id("field-phone")).sendKeys(phone);
        return this;
    }

    public formRecordPage preencherAddressLine1(String addressLine1) {
        navegador.findElement(By.id("field-addressLine1")).sendKeys(addressLine1);
        return this;
    }

    public formRecordPage preencherAddressLine2(String addressLine2) {
        navegador.findElement(By.id("field-addressLine2")).sendKeys(addressLine2);
        return this;
    }

    public formRecordPage preencherCity(String city) {
        navegador.findElement(By.id("field-city")).sendKeys(city);
        return this;
    }

    public formRecordPage preencherState(String state) {
        navegador.findElement(By.id("field-state")).sendKeys(state);
        return this;
    }

    public formRecordPage preencherPostalCode(String postalCode) {
        navegador.findElement(By.id("field-postalCode")).sendKeys(postalCode);
        return this;
    }

    public formRecordPage preencherCountry(String country) {
        navegador.findElement(By.id("field-country")).sendKeys(country);
        return this;
    }

    public formRecordPage preencherEmployeeNumber(String employee) {
        navegador.findElement(By.id("field-salesRepEmployeeNumber")).sendKeys(employee);
        return this;
    }

    public formRecordPage preencherCreditLimit(String creditLimit) {
        navegador.findElement(By.id("field-creditLimit")).sendKeys(creditLimit);
        return this;
    }

    public formRecordPage preencherDeleted(String deleted) {
        navegador.findElement(By.id("field-deleted")).sendKeys(deleted);
        return this;
    }

    public formRecordPage cadastrarPessoa ( String name, String lastName, String firstName, String phone) {
                preencherCustomerName(name);
                preenchercontactLastName(lastName);
                preenchercontactFirstName(firstName);
                preencherPhone(phone);
        return this;
    }

    public formRecordPage cadastrarEndereco ( String addressLine1, String addressLine2, String city, String state,String postalCode, String Country  ) {
                preencherAddressLine1(addressLine1);
                preencherAddressLine2(addressLine2);
                preencherCity(city);
                preencherState(state);
                preencherPostalCode(postalCode);
                preencherCountry(Country);

        return this;
    }

    public formRecordPage clickSave() {
        navegador.findElement(By.id("form-button-save")).click();
        return this;
    }

    public String validarMensagemSave() {
       return navegador.findElement(By.xpath("//div[@id='report-success']/p")).getText();


    }

}
