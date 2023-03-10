# Ejercicio pr谩ctico de introducci贸n a la programaci贸n orientada a objetos

Se recomienda que antes de empezar a programar, leas el enunciado completo y te hagas una idea de c贸mo se va a resolver el problema.

## 馃摑 Instrucciones de entrega

1. Clonar tu repositorio de la asignatura o actualizarlo si ya lo ten铆as clonado.
2. Crear una rama con el nombre `EX002UserManagement` tal como se indica en [este archivo](./entregas/readme.md).
2. En la carpeta `ejercicios/entregas` tal como se indica en [este archivo](./entregas/readme.md), crear un proyecto con el nombre `EX002UserManagement` basado en este [ejemplo](../temario/EX001PooStudent).
3. Implementar la soluci贸n del ejercicio en el proyecto `EX002UserManagement` con las clases que se indican en el enunciado.
3. Ejecutar los tests y verificar que todos pasen.
10. Subir el proyecto a tu repositorio de GitHub.
11. Pedir revisi贸n de c贸digo (Pull request).

## 馃 Enunciado
En la construcci贸n de un Portal Web, una de las tareas a realizar es la definici贸n del subsistema de gesti贸n de usuarios. La gesti贸n de usuarios que vamos a tratar contempla mostrar un men煤 de opciones personalizado al usuario, una vez  虂este ha llevado acabo la autentificaci贸n de manera satisfactoria.

La interacci贸n del usuario con el sistema presenta los siguientes pasos:

* El usuario se autentifica ante el sistema introduciendo login y password.
* El sistema de gesti贸n de usuarios ante un login y password correcto muestra al usuario
el men煤 de operaciones que puede realizar, y un mensaje de autentificaci贸n incorrecta en
caso contrario.

El modelado del problema se puede realizar con las siguientes clases:
* User
* Option (Opciones del men煤)
* Manager

### Clase `User`
La clase Usuario recoge la informaci贸n referente a un usuario potencial del Portal Web:
login, su password y su nombre.

## Clase `Option`
La clase `Option` contiene una lista finita de opciones, y m茅todos para a帽adir y obtener los
valores de las mismas.
Atributos recomendados:
* Lista de opciones
* Opci贸n seleccionada
* N煤mero m谩ximo de opciones

## Clase `Manager`
La clase gestor es la encargada de gestionar la autentificaci贸n de los usuarios, y de mostrar el men煤 de opciones personalizado al usuario.
Atributos recomendados:
* Lista de usuarios
* Usuario autentificado
* Opci贸n seleccionada
* N煤mero m谩ximo de usuarios

## Tests
Implementar los tests necesarios para validar las opciones de un sistema de gesti贸n
de usuarios, registre una serie de usuarios con opciones personalizados, y pruebe una
autentificaci贸n exitosa (listando las opciones) y otra fallida (mostrando un
mensaje por consola).

# 馃憗锔? Nota
- Recuerda que todo lo que se pide en este ejercicio debe estar en Ingl茅s.
- Para cada ejercicio, se recomienda crear una nueva rama en el repositorio de GitHub y, posteriormente, 
solicitar un Pull Request. De esta manera, se podr谩 mantener un registro claro y organizado de cada ejercicio, lo que facilitar谩 su revisi贸n y seguimiento.
- Recuerda que todo lo que se pide en este ejercicio debe estar en el proyecto `EX002UserManagement` tal como se indica en las instrucciones de entrega.
- Recuerda que todos los tests que realice deben pasar para que el ejercicio sea considerado como entregado.
