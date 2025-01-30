class Curso(
    val nombre: String,
    val codigo: String
) {
    private val estudiantes: MutableList<Estudiante> = mutableListOf()

    fun agregarAlumno(estudiante: Estudiante) {
        estudiantes.add(estudiante)
        println("Estudiante ${estudiante.nombre} agregado al curso $nombre.")
    }

    fun mostrarEstudiantes() {
        println("Estudiantes inscritos en el curso $nombre:")
        estudiantes.forEach { println("- ${it.nombre} (DNI: ${it.dni})") }
    }
}

class Estudiante(
    val nombre: String,
    val dni: String
) {
    fun inscribirse(curso: Curso) {
        curso.agregarAlumno(this)
    }
}

fun main() {
    val cursoKotlin = Curso("Programación", "PROG101")

    val estudiante1 = Estudiante("Juan Pérez", "12345678")
    val estudiante2 = Estudiante("María Gómez", "87654321")

    estudiante1.inscribirse(cursoKotlin)
    estudiante2.inscribirse(cursoKotlin)

    cursoKotlin.mostrarEstudiantes()
}

