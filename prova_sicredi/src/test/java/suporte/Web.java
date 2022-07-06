package suporte;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
   public static WebDriver createChrome() {
       // Abrir browser
       System.setProperty("webdriver.chrome.driver","C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2022.1.3\\driver\\chromedriver.exe");
       WebDriver navegador = new ChromeDriver();
       navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       navegador.manage().window().maximize();
       // Navegar para página
       navegador.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");

       return navegador;


   }
}
