package definitions;

import io.cucumber.java.es.*;
import pageobjects.loginPage;
import pageobjects.menuPage;
import pageobjects.permisosPage;

public class loginDefinition {
    permisosPage permisos;
    loginPage login;
    menuPage menu;

    public loginDefinition() {
        permisos=new permisosPage();
        login=new loginPage();
        menu=new menuPage();
    }

    @Dado("se debe otorgar permisos")
    public void seDebeOtorgarPermisos() {
        permisos.clickContinuar();
        permisos.clickOK();
    }

    @Cuando("ingreso el usuario {string}")
    public void ingresoElUsuario(String user) {
        login.escribirUsuario(user);
    }

    @E("ingreso la clave {string}")
    public void ingresoLaClave(String clave) {
        login.escribirPassword(clave);
    }

    @Y("doy click al boton login")
    public void doyClickAlBotonLogin() {
        login.clickIngresar();
    }

    @Entonces("debe cargar el menú")
    public void debeCargarElMenú() {
        menu.validarTitulo();
    }

    @Entonces("debe aparecer el mensaje {string}")
    public void debeAparecerElMensaje(String msj) {
        login.validarLoginFallido(msj);
    }
}
