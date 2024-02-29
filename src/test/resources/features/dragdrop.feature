#language:es
  Característica: Funcionalidad Drag and Drop

    Antecedentes: login
      Dado se debe otorgar permisos
      Cuando ingreso el usuario "admin"
      E ingreso la clave "admin"
      Y doy click al boton login
      Entonces debe cargar el menú

    @CRITICOS
    Escenario: Mover el elemento hacia una dirección
      Dado que ingreso a la opción de drag and drop
      Cuando muevo el elemento hacia otro lado
      Entonces se muestra el mensaje exitoso