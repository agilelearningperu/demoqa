package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import pageobjects.menuPage;
import pageobjects.verticalPage;

public class swipeDefinition {

    menuPage menu;
    verticalPage swipe;

    public swipeDefinition() {
        menu = new menuPage();
        swipe = new verticalPage();
    }

    @Dado("que ingreso a la opción de vertical swipe")
    public void queIngresoALaOpciónDeVerticalSwipe() {
        menu.clickVeticalSwipe();
    }

    @Cuando("realizo la busqueda del elemento {string}")
    public void realizoLaBusquedaDelElemento(String texto) {
        swipe.encontrarOpcion(texto);
    }
}
