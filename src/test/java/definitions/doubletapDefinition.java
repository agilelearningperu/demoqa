package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import pageobjects.doublePage;
import pageobjects.menuPage;

public class doubletapDefinition {
    menuPage menu;
    doublePage tap;

    public doubletapDefinition() {
        menu = new menuPage();
        tap = new doublePage();
    }

    @Dado("que ingreso a la opción de double tap")
    public void queIngresoALaOpciónDeDoubleTap() {
        menu.clickDoubleTap();
    }

    @Cuando("se da doble click al boton")
    public void seDaDobleClickAlBoton() {
        tap.dobleClickBoton();
    }

    @Entonces("aparece el mensaje")
    public void apareceElMensaje() {
        tap.validarMensaje();
        tap.clickOK();
    }
}
