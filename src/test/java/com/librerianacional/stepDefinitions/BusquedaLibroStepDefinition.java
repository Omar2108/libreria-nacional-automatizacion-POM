package com.librerianacional.stepDefinitions;

import com.librerianacional.step.InicioStep;
import com.librerianacional.step.ConfirmarStep;
import com.librerianacional.step.DetalleLibroStep;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class BusquedaLibroStepDefinition {

    @Steps
    InicioStep libros;
    @Steps
    DetalleLibroStep deta;

    @Steps
    ConfirmarStep confirmarStep;
    @Dado("que el usuario abre la pagina de la libreria nacional")
    public void queElUsuarioAbreLaPaginaDeLaLibreriaNacional() {
        libros.abrirNavegador();
    }
    @Cuando("el usuario busca el libro")
    public void elUsuarioBuscaElLibro() {
        libros.buscarLibro();
    }
    @Cuando("de clic sobre el nombre del libro")
    public void deClicSobreElNombreDelLibro() {
        libros.detalleLibro();
    }
    @Cuando("ingrese la cantidad de libro ha agregar")
    public void ingreseLaCantidadDeLibroHaAgregar() {
        deta.agregarCantidadLibros();
    }
    @Cuando("de clic en añadir al carrito")
    public void deClicEnAñadirAlCarrito() {
        deta.agregarAlCarrito();
    }
    @Entonces("el usuario podrá observar el mensaje de confirmacion.")
    public void elUsuarioPodráObservarElMensajeDeConfirmacion() {
        confirmarStep.confirmarMsj();
    }


}
