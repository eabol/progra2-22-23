# Ejercicio pr谩ctico de introducci贸n a la programaci贸n orientada a objetos

Se recomienda que antes de empezar a programar, leas el enunciado completo y te hagas una idea de c贸mo se va a resolver el problema.

## 馃摑 Instrucciones de entrega

1. Clonar tu repositorio de la asignatura o actualizarlo si ya lo ten铆as clonado.
2. Crear una rama con el nombre `EX001PooStudent` tal como se indica en [este archivo](./entregas/readme.md).
2. En la carpeta `ejercicios/entregas` tal como se indica en [este archivo](./entregas/readme.md), crear un proyecto con el nombre `EX001PooStudent` basado en este [ejemplo](../temario/EX001PooStudent).
3. Implementar los m茅todos de la clase `Student` tal como se indica en el enunciado.
4. Implementar los m茅todos de la clase `Subject` tal como se indica en el enunciado.
5. La clase `Main` debe contener el m茅todo `main` para mostrar la soluci贸n del problema, en el ejemplo se tiene el c贸digo base.
6. Implementar la clase `StudentTest` tal como se indica en el enunciado.
7. Implementar la clase `SubjectTest` tal como se indica en el enunciado.
8. Crear el diagrama de clases para  `Student` y `Subject` con `PlantUML` tal como se indica en el enunciado.
9. Ejecutar los tests y verificar que todos pasen.
10. Subir el proyecto a tu repositorio de GitHub.
11. Pedir revisi贸n de c贸digo (Pull request).

## 馃 Enunciado

Se necesita gestionar las notas de los alumnos relacionadas con una
asignatura. Para solucionar el problema se ha creado un programa principal
donde utiliza las clases `Student` y `Subject`.

Como un agregado importante a帽adir comentario de documentaci贸n apropiados a los m茅todos de las clases `Student` y `Subject`.

### Clase `Student`
- Tendr谩 los siguientes atributos:
  - `name` (String): Nombre del alumno.
  - `surname` (String): Apellidos del alumno.
  - `id` (String): Identificador del alumno.
  - `grade` (float): Nota del alumno.

Implementar los getters y setters de los atributos de la clase `Student`.

## Clase `Subject`
- Tendr谩 los siguientes atributos:
  - `name` (String): Nombre de la asignatura.
  - `students` (Student[]): Alumnos matriculados en la asignatura.
  - `isOrdered` (boolean): Indica si los alumnos est谩n ordenados por nota.
  - `position` (int): Posici贸n del 煤ltimo alumno matriculado.
  - `capacity` (int): Capacidad m谩xima de alumnos que puede tener la asignatura.

- Implementar los getters y setters de los atributos de la clase `Subject`.
- Revisar la implementaci贸n del m茅todo `addStudent` que a帽ade un alumno a la asignatura.
- Revisar la implementaci贸n del m茅todo `orderStudents` que ordena los alumnos por nota.
- Implementar el m茅todo `getStudent` que devuelve el alumno que ocupa la posici贸n indicada.
- Implementar el m茅todo `getBestStudent` que devuelve el alumno con la mejor nota.
- Implementar el m茅todo `getWorstStudent` que devuelve el alumno con la peor nota.
- Implementar el m茅todo `getAverage` que devuelve la nota media de la asignatura.
- Implementar el m茅todo `getMedian` que devuelve la nota mediana de la asignatura.

## Tests
- Tests de la clase `StudentTest`.
   - Implementar tests para los m茅todos `getName`, `getSurname`, `getId`, `getGrade` y `setGrade`.
   - Implementar un test para el constructor de la clase `Student`.
- Implementar los tests de la clase `SubjectTest`.
   - Implementar tests para los m茅todos `getName`, `getCapacity`, `getIsOrdered`, `getPosition` y `getStudent`.
   - Implementar un test para el constructor de la clase `Subject`.
   - Implementar tests para los m茅todos `addStudent`, `orderStudents`, `getBestStudent`, `getWorstStudent`, `getAverage` y `getMedian`.

# 馃憗锔? Nota
- Recuerda que todo lo que se pide en este ejercicio debe estar en Ingl茅s.
- Para cada ejercicio, se recomienda crear una nueva rama en el repositorio de GitHub y, posteriormente, 
solicitar un Pull Request. De esta manera, se podr谩 mantener un registro claro y organizado de cada ejercicio, lo que facilitar谩 su revisi贸n y seguimiento.
- Recuerda que todo lo que se pide en este ejercicio debe estar en el proyecto `EX001PooStudent` tal como se indica en las instrucciones de entrega.
- Recuerda que todos los tests que realice deben pasar para que el ejercicio sea considerado como entregado.
