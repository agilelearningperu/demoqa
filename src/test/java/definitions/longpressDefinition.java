package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import pageobjects.longpressPage;
import pageobjects.menuPage;

import java.io.IOException;

public class longpressDefinition {
    menuPage menu;
    longpressPage longpress;

    public longpressDefinition() {
        menu = new menuPage();
        longpress = new longpressPage();
    }

    @Dado("que ingreso a la opción de longpress")
    public void queIngresoALaOpciónDeLongpress() throws IOException {
        menu.evidencia();
        menu.clickLongPress();
    }

    @Cuando("se da un click prolongado al boton")
    public void seDaUnClickProlongadoAlBoton() throws IOException {
        longpress.evidencia();
        longpress.LongPress();
    }

    @Entonces("aparece el mensaje de longpress")
    public void apareceElMensajeDeLongpress() throws IOException {
        longpress.validarMensaje();
        longpress.evidencia();
        longpress.clickOK();
    }
}
