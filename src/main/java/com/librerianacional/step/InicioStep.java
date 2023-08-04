package com.librerianacional.step;

import com.librerianacional.models.Datos;
import com.librerianacional.pageObjects.InicioPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class InicioStep {
    @Page
    InicioPage inicio;
    @Step("Abrir la pagina de la libreria nacional")
    public void abrirNavegador(){
        inicio.openUrl("https://librerianacional.com/");

    }

    @Step("busqueda del libro")
    public void buscarLibro(){

        String lib = Datos.data().get(0).get("Libro");

        List<WebElement> elemento = inicio.getDriver().findElements(inicio.getTxtBuscador());
        elemento.get(1).sendKeys(lib);
        elemento.get(1).sendKeys(Keys.ENTER);
    }


    @Step("detalle del libro")
    public void detalleLibro(){

        WebDriverWait t = new WebDriverWait(inicio.getDriver(), Duration.ofSeconds(10));
        WebElement until = t.until(ExpectedConditions.visibilityOf(inicio.getDriver().findElement(inicio.getLinkLibro())));
        until.click();

    }


}
