# Proyecto Contenidos Audiovisuales - Programación Orientada a Objetos

## Descripción del Proyecto

Este proyecto es una aplicación en Java que modela distintos tipos de contenidos audiovisuales utilizando conceptos avanzados de Programación Orientada a Objetos (POO). Incluye clases para películas, series de TV, documentales y nuevas subclases como reality shows y animes, además de clases relacionadas como actores, temporadas e investigadores.

El sistema permite crear, manipular y mostrar información detallada de cada tipo de contenido, mostrando la aplicación práctica de herencia, asociación, agregación y composición.

---

## Clases y Funcionalidades Nuevas

- **Actor:** Asociado a la clase `Pelicula`.  
- **Temporada:** Asociado a la clase `SerieDeTV` como agregación.  
- **Investigador:** Asociado a la clase `Documental`.  
- **RealityShow:** Nueva subclase de `ContenidoAudiovisual` con atributos propios y métodos.  
- **Anime:** Nueva subclase de `ContenidoAudiovisual` con atributos y métodos específicos.  

Cada clase cuenta con métodos para crear objetos, establecer y obtener atributos, y mostrar detalles completos incluyendo sus relaciones.

---

## Instrucciones para Clonar y Ejecutar el Proyecto

1. Clonar el repositorio:

2. Abrir el proyecto en Eclipse o Visual Studio Code con soporte Java.  
3. Navegar a la clase principal `poo.PruebaAudioVisual` y ejecutar el método `main`.  
4. Observar la salida por consola que muestra los detalles de todos los contenidos audiovisuales y sus relaciones.

---

## Mejoras Adicionales

- Implementación de un sistema funcional que permite la creación y manipulación completa de objetos y relaciones.  
- Métodos de visualización mejorados para mostrar las relaciones entre clases (por ejemplo, actores en películas, temporadas en series).  
- Uso de estructuras de datos como arreglos para manejar colecciones (temporadas en series).  
- Incremento automático de IDs para cada contenido audiovisual.  
- Documentación clara del código y organización en paquetes.

---