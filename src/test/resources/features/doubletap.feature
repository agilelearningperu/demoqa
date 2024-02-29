#language:es
  Característica: Funcionalidad Double Tap

    Antecedentes: login
      Dado se debe otorgar permisos
      Cuando ingreso el usuario "admin"
      E ingreso la clave "admin"
      Y doy click al boton login
      Entonces debe cargar el menú

      @CRITICOS
    Escenario: Doble click en el botón
      Dado que ingreso a la opción de double tap
      Cuando se da doble click al boton
      Entonces aparece el mensaje