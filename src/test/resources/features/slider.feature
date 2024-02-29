#language:es
  Característica: Funcionalidad Slider

    Antecedentes: login
      Dado se debe otorgar permisos
      Cuando ingreso el usuario "admin"
      E ingreso la clave "admin"
      Y doy click al boton login
      Entonces debe cargar el menú

      Escenario: Mover slider al 50%
        Dado que ingreso a la opción de slider
        Cuando realizo el movimiento del slider al 50%

    Escenario: Mover slider al 20%
      Dado que ingreso a la opción de slider
      Cuando realizo el movimiento del slider al 20%

    @CRITICOS
    Escenario: Mover slider al 90%
      Dado que ingreso a la opción de slider
      Cuando realizo el movimiento del slider al 90%
