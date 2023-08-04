package com.librerianacional.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ConfirmacionPage extends PageObject {

    private final By txtConfirmar = By.xpath("//div[@class='col-12 text--gray text--sml text--lh-1 px-0 text--semibold']");

    public By getTxtConfirmar() {
        return txtConfirmar;
    }
}
