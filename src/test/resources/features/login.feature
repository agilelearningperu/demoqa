#language:es
  Característica: Funcionalidad Login

    @CRITICOS
    Escenario: Validar login exitoso
      Dado se debe otorgar permisos
      Cuando ingreso el usuario "admin"
      E ingreso la clave "admin"
      Y doy click al boton login
      Entonces debe cargar el menú

    Escenario: Validar login con usuario incorrecto
      Dado se debe otorgar permisos
      Cuando ingreso el usuario "alex"
      E ingreso la clave "admin"
      Y doy click al boton login
      Entonces debe aparecer el mensaje "Invalid  Credentials"

    Escenario: Validar login con clave incorrecta
      Dado se debe otorgar permisos
      Cuando ingreso el usuario "admin"
      E ingreso la clave "12345"
      Y doy click al boton login
      Entonces debe aparecer el mensaje "Invalid  Credentials"

