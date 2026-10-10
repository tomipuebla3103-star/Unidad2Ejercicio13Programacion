<img width="324" height="160" alt="WhatsApp Image 2026-10-01 at 14 35 21" src="https://github.com/user-attachments/assets/7948e3ff-a66a-4854-a16b-50daed0b4719" />

Sistema de Control de Acceso por Tarjeta

 Descripción
Este proyecto consiste en un sistema en Java que permite controlar el ingreso de empleados a diferentes zonas de un edificio mediante tarjetas de proximidad. La lectora envía las credenciales al controlador de acceso, que verifica si el empleado tiene permiso para ingresar.

Clases
- **TarjetaRFID:** contiene el código único de la tarjeta y el nivel de acceso del empleado.
- **ControladorDeAcceso:** verifica los permisos mediante el método `verificarAcceso(TarjetaRFID tarjeta, String zona)`, que devuelve `true` si el acceso está autorizado o `false` si es rechazado.
- **LectorTarjetas:** mantiene una referencia al controlador y se encarga de enviar las tarjetas para validar el ingreso.

Funcionamiento
En el `main` se crea el controlador con una base de datos interna de permisos. También se crean una tarjeta válida y otra inválida para simular dos intentos de ingreso y mostrar los resultados por consola.

 Recorrido del mensaje
1. El programa crea el controlador de acceso y configura los permisos.
2. Se crean las tarjetas que se utilizarán para probar el sistema.
3. El usuario presenta una tarjeta en la lectora.
4. La lectora envía la tarjeta y la zona solicitada al método `verificarAcceso()`.
5. El controlador comprueba si la tarjeta es válida y si su nivel de acceso permite ingresar a esa zona.
6. Si tiene permiso, devuelve `true` y se autoriza el ingreso. En caso contrario, devuelve `false` y se rechaza.
7. Finalmente, la lectora muestra por consola el resultado de cada intento.

 Validaciones
El sistema verifica que la tarjeta esté registrada y que tenga el nivel de acceso necesario para ingresar a la zona solicitada. Esto evita que personas sin autorización accedan a sectores restringidos.

 Objetivo
Practicar la comunicación entre objetos en Java, el uso de referencias entre clases, los métodos con parámetros, los valores booleanos y la validación de permisos.
