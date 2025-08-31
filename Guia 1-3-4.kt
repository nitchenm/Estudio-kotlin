import kotlinx.coroutines.*

data class PerfilUsuario(val nombreUsuario:String, val email: String)

sealed class ResultadoLogin

data class Exito(val perfil: PerfilUsuario): ResultadoLogin()

data class Error(val mensaje: String): ResultadoLogin()

object Autenticando: ResultadoLogin()

suspend fun autenticarUsuario(usuario: String, contrasena: String): ResultadoLogin{
    delay(2000)
    val usuarioEjemplo = PerfilUsuario("Nit", "nit@gmail.com")
    if (usuario == "admin" && contrasena == "1234" ){
        return Exito(usuarioEjemplo)
    }else{
        return Error("Credenciales incorrectas.")
    }
}

fun main() = runBlocking {
    println("Autenticando...")

    val usuario = autenticarUsuario("admin", "1234")

    when(usuario){
        is Exito -> println("Exito : ${usuario.perfil.nombreUsuario}, ${usuario.perfil.email}")
        is Error -> println("Error : ${usuario.mensaje}")
        Autenticando -> println("Autenticando...") 
    }
}