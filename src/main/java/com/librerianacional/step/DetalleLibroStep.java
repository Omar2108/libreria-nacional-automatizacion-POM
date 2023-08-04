package com.librerianacional.step;

import com.librerianacional.models.Datos;
import com.librerianacional.pageObjects.DetalleLibroPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DetalleLibroStep {

    @Page
    DetalleLibroPage detalle;

    @Step("agregar cantidad de libros")
    public void agregarCantidadLibros(){

        String c = Datos.data().get(0).get("Cantidad");
        int cantidad = Integer.parseInt(c);


        for (int i = 1; i < cantidad; i++) {
            WebDriverWait t = new WebDriverWait(detalle.getDriver(), Duration.ofSeconds(15));
            WebElement until = t.until(ExpectedConditions.presenceOfElementLocated(detalle.getBtnCantidad()));
            until.click();
        }

    }

    @Step("agregar al carrito de compra")
    public void agregarAlCarrito(){
        WebDriverWait t = new WebDriverWait(detalle.getDriver(), Duration.ofSeconds(10));
        WebElement until = t.until(ExpectedConditions.visibilityOf(detalle.getDriver().findElement(detalle.getBtnAgregar())));
        until.click();
    }
}
