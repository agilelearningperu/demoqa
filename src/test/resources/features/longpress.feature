#language:es
Característica: Funcionalidad LongPress

  Antecedentes: login
    Dado se debe otorgar permisos
    Cuando ingreso el usuario "admin"
    E ingreso la clave "admin"
    Y doy click al boton login
    Entonces debe cargar el menú

    @CPINICIAL @REGRESION @CRITICOS
    Escenario: Click prolongado a un botón
      Dado que ingreso a la opción de longpress
      Cuando se da un click prolongado al boton
      Entonces aparece el mensaje de longpress