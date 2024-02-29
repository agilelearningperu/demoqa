package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import pageobjects.menuPage;
import pageobjects.sliderPage;

public class sliderDefinition {
    sliderPage slider;
    menuPage menu;

    public sliderDefinition() {
        slider = new sliderPage();
        menu = new menuPage();
    }

    @Dado("que ingreso a la opción de slider")
    public void queIngresoALaOpciónDeSlider() {
        menu.clickSlider();
    }

    @Cuando("realizo el movimiento del slider al {float}%")
    public void realizoElMovimientoDelSlider(float valor) {
        slider.moverSlider(valor);
    }
}
