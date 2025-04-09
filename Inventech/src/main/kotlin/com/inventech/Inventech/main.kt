import java.sql.DriverManager

fun main() {
    val url = "jdbc:mysql://localhost:3306/inventech_db"
    val user = "root"
    val password = "1206"

    try {
        val connection = DriverManager.getConnection(url, user, password)
        println("Conectado correctamente")
        connection.close()
    } catch (e: Exception) {
        println("Error de conexión: ${e.message}")
    }
}