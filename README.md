# Practica5.1

**1.Interpreta el significado del diagrama de clases.**

a) Relación entre las clases. Significado, tipo, multiplicidad. 

En la relación “contiene” significa que Curso está formado por Estudiante, es de tipo agregación debido a que Estudiante forman parte de Cursos, la multiplicidad es de 1 curso y * estudiantes.

b) Elementos de las clases. Tipos y propósitos. 

**Curso:**

*nombre:* String, una cadena de carácteres

*codigo:* String, una cadena de carácteres

*estudiantes:* MutableList, una lista que puede ser cambiada

**Estudiante:**

nombre: String

dni: String

c)Significado del método agregarAlumno(). Funcionamiento. 

agregarAlumno() significa que las personas inscritas son agregados a la lista estudiantes del curso.

d) Significado del método inscribirse()

inscribirse() significa que los estudiantes se meten en el curso y se aagregan a la lista estudiantes.

**2. Generación de código a partir del diagrama.**

a) Crear clases

b) Crear relaciones

c) Crear main (para probar el sistema).

