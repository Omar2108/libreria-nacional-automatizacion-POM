package com.librerianacional.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class DetalleLibroPage extends PageObject {

    private final By BtnCantidad = By.xpath("//i[@class='icon-plus-light text--gray text--xm text--light']");
    private final By BtnAgregar = By.xpath("//button[text()='Añadir al carrito']");

    public By getBtnCantidad() {
        return BtnCantidad;
    }

    public By getBtnAgregar() {
        return BtnAgregar;
    }
}
