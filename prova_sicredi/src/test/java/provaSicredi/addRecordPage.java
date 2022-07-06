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
                .cadastrarPessoa("Teste Sicredi","Teste", "Julio", "51 9999-9999")
                .cadastrarEndereco("Av Assis Brasil, 3970", "Torre D", "Porto Alegre", "RS", "91000-000", "Brasil" )
                .preencherEmployeeNumber("2022")
                .preencherCreditLimit("200")
                .preencherDeleted("TRUE")
                .clickSave()
                .validarMensagemSave();

        assertEquals("Your data has been successfully stored into the database. Edit Record or Go back to list", msg);



    }

    @After
    public void teardown() {
       navegador.quit();
    }

}
