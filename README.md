# Sistema de Gestión de Contenido Audiovisual

Este proyecto es una aplicación de consola en Java para gestionar un catálogo de contenido audiovisual, incluyendo películas, series, documentales y más. Originalmente concebido como un simple script de prueba, el proyecto ha sido refactorizado exhaustivamente para incorporar principios de diseño de software modernos, una arquitectura limpia y un conjunto completo de pruebas unitarias.

## Evolución del Proyecto y Mejoras Implementadas

El código original consistía en un único archivo de prueba (`PruebaAudioVisual.java`) que instanciaba objetos y llamaba a métodos `mostrarDetalles()` directamente desde las clases del modelo. Este enfoque, aunque funcional para demostraciones simples, presentaba limitaciones significativas en cuanto a mantenibilidad, escalabilidad y fiabilidad.

Los cambios implementados transformaron el proyecto en una aplicación robusta siguiendo las mejores prácticas de la industria:

### 1. Arquitectura Modelo-Vista-Controlador (MVC)

Se abandonó el enfoque monolítico para adoptar el patrón de diseño MVC, separando claramente las responsabilidades del sistema:

-   **Modelo (`/uni1a`)**: Contiene las clases de datos puras (`Pelicula`, `SerieDeTV`, `Actor`, etc.). Su única responsabilidad es representar y contener el estado de los datos. Se eliminó toda lógica de presentación (`mostrarDetalles()`) y se reemplazó por métodos `toString()` para la representación de texto.
-   **Vista (`/view`)**: La clase `ContenidoView` ahora gestiona de forma exclusiva toda la interacción con el usuario a través de la consola. Es responsable de mostrar menús y resultados, sin contener ninguna lógica de negocio.
-   **Controlador (`/controller`)**: `ContenidoController` actúa como el cerebro de la aplicación, orquestando la comunicación entre la Vista y el Modelo. Maneja las acciones del usuario y coordina la lógica de la aplicación.

### 2. Principios SOLID y Código Limpio

Se aplicaron principios de código limpio y SOLID para mejorar la calidad y la estructura del código:

-   **Principio de Responsabilidad Única (SRP)**: Cada clase tiene ahora un propósito bien definido (ver MVC). Se introdujo un `ContenidoService` para encapsular la lógica de manejo de archivos, separándola del controlador.
-   **Métodos Claros y Pequeños**: Los métodos largos se dividieron en funciones más pequeñas y específicas (por ejemplo, los métodos `parse...` en `ContenidoService`).
-   **Nomenclatura Significativa**: Se utilizaron nombres de clases, métodos y variables que describen claramente su función.

### 3. Gestión de Dependencias con Maven

El proyecto ahora es gestionado por **Apache Maven**. Esto ofrece varias ventajas clave:
-   **Manejo Automático de Dependencias**: El archivo `pom.xml` declara las bibliotecas necesarias, como **JUnit 5**, y Maven se encarga de descargarlas y gestionarlas.
-   **Construcción Estándar**: Proporciona un ciclo de vida de construcción estándar (`clean`, `compile`, `test`, `package`), lo que garantiza que el proyecto se pueda construir y probar de manera consistente en cualquier entorno.

### 4. Implementación Exhaustiva de Pruebas Unitarias

La mejora más significativa en la fiabilidad del proyecto es la adición de un conjunto completo de pruebas unitarias utilizando **JUnit 5**.

#### Comparación: Antes vs. Ahora

-   **Antes**: La única "prueba" era la ejecución manual del archivo `PruebaAudioVisual.java`, que verificaba visualmente la salida en la consola. Este método era propenso a errores, no era automatizado y no podía verificar sistemáticamente casos límite.
-   **Ahora**: El proyecto cuenta con una suite de pruebas automatizadas en el directorio `src/test/java/` que cubren los siguientes aspectos:
    -   **Pruebas del Modelo (`ActorTest`, `PeliculaTest`, etc.)**: Se verifica que cada objeto se construya correctamente, que los getters devuelvan los valores esperados y que los métodos clave (`toString`, `toCSVString`) generen las cadenas correctas.
    -   **Pruebas del Servicio (`ContenidoServiceTest`)**: Se prueba la lógica de negocio más crítica: el ciclo completo de guardar una lista de objetos en un archivo CSV y luego cargarla, verificando que los datos se mantengan íntegros y se reconstruyan correctamente en memoria.
    -   **Aislamiento y Fiabilidad**: Las pruebas usan funcionalidades como `@TempDir` de JUnit para crear archivos en directorios temporales, asegurando que las pruebas no dejen basura y se ejecuten en un entorno limpio y aislado cada vez.

La implementación de pruebas unitarias garantiza que futuras modificaciones o adiciones al código no rompan la funcionalidad existente, permitiendo un desarrollo más seguro y rápido.

## Cómo Ejecutar la Aplicación

1.  Clonar el repositorio.
2.  Asegurarse de tener Java y Maven instalados.
3.  Abrir el proyecto en un IDE como VS Code o IntelliJ.
4.  La aplicación se puede ejecutar directamente desde la clase `poo.Main.java`.

## Cómo Ejecutar las Pruebas Unitarias

La forma recomendada de ejecutar todas las pruebas y verificar la integridad del proyecto es a través de Maven.

1.  Abre una terminal en la raíz del proyecto.
2.  Ejecuta el siguiente comando:
    ```bash
    mvn clean test
    ```
3.  Maven limpiará las compilaciones anteriores, compilará el proyecto y ejecutará todas las pruebas definidas en `src/test/java/`. Un mensaje de `BUILD SUCCESS` al final indicará que todo el código es correcto y todas las pruebas han pasado.