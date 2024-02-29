#language:es
  Característica: Funcionalidad Swipe

    Antecedentes: login
      Dado se debe otorgar permisos
      Cuando ingreso el usuario "admin"
      E ingreso la clave "admin"
      Y doy click al boton login
      Entonces debe cargar el menú

    Escenario: Buscar elemento Appium
      Dado que ingreso a la opción de vertical swipe
      Cuando realizo la busqueda del elemento "Appium"


    @CRITICOS
    Escenario: Buscar elemento Jest
      Dado que ingreso a la opción de vertical swipe
      Cuando realizo la busqueda del elemento "Jest"
