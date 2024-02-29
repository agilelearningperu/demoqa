package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import pageobjects.dragdropPage;
import pageobjects.menuPage;

public class dragdropDefinition {
    menuPage menu;
    dragdropPage dragdrop;

    public dragdropDefinition() {
        menu = new menuPage();
        dragdrop = new dragdropPage();
    }

    @Dado("que ingreso a la opción de drag and drop")
    public void queIngresoALaOpciónDeDragAndDrop() {
        menu.clickDragDrop();
    }

    @Cuando("muevo el elemento hacia otro lado")
    public void muevoElElementoHaciaOtroLado() {
        dragdrop.moverObjeto();
    }


    @Entonces("se muestra el mensaje exitoso")
    public void seMuestraElMensajeExitoso() {
        dragdrop.validarMensaje();
    }
}
