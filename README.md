### Proyecto de Movimiento Parabólico

Este programa implementa un programa en Java para resolver cálculos de movimiento parabólico en física. Permite al usuario ingresar valores iniciales de velocidad y ángulo, y calcula componentes de velocidad y desplazamiento, así como la altura máxima alcanzada. El código maneja posibles errores en la entrada y da retroalimentación detallada al usuario.

### Contenidos

1. [Descripción General](#descripción-general)
2. [Estructura del Programa](#estructura-del-programa)
3. [Instalación](#instalación)
4. [Ejemplo de Uso](#ejemplo-de-uso)
6. [Manejo de Exepciones](#manejo-de-excepciones)

### Descripción General

Este programa permite realizar cálculos relacionados con el movimiento parabólico. Los usuarios pueden ingresar la velocidad inicial y el ángulo de lanzamiento de un objeto, y el programa calculará las componentes de la velocidad en los ejes X y Y, el desplazamiento horizontal en un tiempo específico y la altura máxima alcanzada.

### Estructura del programa

El programa está organizado en dos archivos principales:
  1. Main.java: Archivo principal donde se ejecuta la lógica del programa y se interactúa con el usuario.
  2. Parabolico.java: Contiene la clase Parabolico que implementa los métodos y cálculos del movimiento parabólico.
     
### Instalación

1. Para instalar nuestro programa se lo puede hacer desde la pagina de GitHub del proyecto
2. Desde la línea de comandos (Teniendo GIT instalado) ejecutando el comando: git clone

### Uso del prograna

Al ejecutar el programa, se solicitarán los valores de velocidad inicial y ángulo. A continuación, el programa calculará:
  1. Componente de velocidad en el eje X (horizontal)
  2. Componente de velocidad en el eje Y (vertical)
  3. Desplazamiento horizontal en un tiempo de 2.45 segundos
  4. Altura máxima alcanzada, calculada con gravedad en tipo flotante y entero.
     
La salida del pograma se mostrará como a continuación:  
    Resolviendo ejercicio de movimiento parabólico  
    Ingrese el valor de la velocidad inicial (m/s): 20  
    Ingrese el valor del ángulo que se forma al realizar el movimiento: 45  
    El valor de la velocidad inicial en X es: 14.14 m/s  
    El valor de la velocidad inicial en Y es: 14.14 m/s  
    El desplazamiento horizontal del objeto en un tiempo de 2.45 segundos es: 34.65 metros  
    El resultado de la altura máxima con la gravedad como flotante es: 10.20  
    El resultado de la altura máxima con la gravedad como entero es: 11.11  

### Manejo de excepciones

El programa utiliza una estructura try-catch en el Main.java para manejar excepciones. Si se ingresa un valor no numérico. 
El programa muestra un mensaje de error específico:

**** Ocurrió un error al procesar los datos. ****

Detalles del error: (descripción del error)

