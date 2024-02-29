package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import pageobjects.googlePage;

public class webDefinition {
    googlePage google;

    public webDefinition() {
        google = new googlePage();
    }

    @Dado("que la web de google este disponible")
    public void queLaWebDeGoogleEsteDisponible() {
        hooks.driverand.get("https://www.google.com.pe/");
    }

    @Cuando("busco el texto {string}")
    public void buscoElTexto(String texto) {
        google.buscarTexto(texto);
    }
}
