package br.com.chronosacademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteWeb {

    ChromeDriver driver;

    @Before
    public void inicializaTeste(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.chronosacademy.com.br");

    }

    @Test
    public void primeiroTeste(){

        String xpathtitulo = "//section[2]/div[3]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathtitulo));
        String titulo = txtTitulo.getText();

        Assert.assertEquals("Porque Tempo É Conhecimento.", titulo);

    }

    @Test
    public void segundoTeste (){
        System.out.println("teste 2");
    }

    @Test
    public void terceiroTeste () {
        System.out.println("teste 3");

    }

    @After
    public void finalizaTeste(){
        driver.quit();
    }

}
