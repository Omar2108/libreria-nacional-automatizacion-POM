package com.librerianacional.step;

import com.librerianacional.pageObjects.ConfirmacionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfirmarStep {

    @Page
    ConfirmacionPage confirmacionPage;

    @Step("confirmar mensaje")
    public void confirmarMsj(){
        WebDriverWait t = new WebDriverWait(confirmacionPage.getDriver(), Duration.ofSeconds(10));
        t.until(ExpectedConditions.presenceOfElementLocated(confirmacionPage.getTxtConfirmar()));
        String txt = confirmacionPage.getDriver().findElement(confirmacionPage.getTxtConfirmar()).getText();
        Assert.assertEquals("¡Producto agregado al carrito de compras!",txt);

    }
}
