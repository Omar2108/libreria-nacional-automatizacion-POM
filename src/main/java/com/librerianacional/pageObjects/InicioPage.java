package com.librerianacional.pageObjects;



import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.How;


public class InicioPage extends PageObject {


    private final By txtBuscador = By.xpath("//input[@class='form-control form-search ng-untouched ng-pristine ng-invalid']");
    private final By linkLibro = By.xpath("//a[@class='d-flex text--blue text--sm text--bold text--lh-1 book-title']");
    public By getTxtBuscador() {
        return txtBuscador;
    }

    public By getLinkLibro() {
        return linkLibro;
    }
}
