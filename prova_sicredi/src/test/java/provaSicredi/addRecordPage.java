package provaSicredi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import suporte.Web;
import pages.addTemaPage;
import static org.junit.Assert.*;


public class addRecordPage {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
    }
    @Test
    public void addNovoRecord() {
        String msg = new addTemaPage(navegador)
                .EscolherTema()
                .clickAddRecord()
                .preencherCustomerName("Teste Sicredi")
                .preenchercontactLastName("Teste")
                .preenchercontactFirstName("Julio")
                .preencherPhone("51 9999-9999")
                .preencherAddressLine1("Av Assis Brasil, 3970")
                .preencherAddressLine2("Torre D")
                .preencherCity("Porto Alegre")
                .preencherState("RS")
                .preencherPostalCode("91000-000")
                .preencherCountry("Brasil")
                .preencherEmployee("6666666")
                .preencherCreditLimit("200")
                .preencherDeleted("TRU")
                .clickSave()
                .validarMensagemSave();

        assertEquals("Your data has been successfully stored into the database. Edit Record or Go back to list", msg);



    }

    @After
    public void teardown() {
        //navegador.quit();
    }

}
