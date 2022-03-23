import java.util.Random
import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)

    print("Waktu Sekarang: ")
    val waktu = input.nextLine()
    print("Nama Anda: ")
    val nama = input.nextLine()
    print("Umur Anda: ")
    val umur = input.nextInt()
    print("Suhu Tubuh Anda: ")
    var suhu = readLine()
    if (suhu == null){
        suhu = randomNumber(35.0, 37.0).toString()
    }

    println("Selamat $waktu, $nama.")
    println("Umur anda $umur tahun.")
    println("Suhu tubuh anda $suhu derajat celcius")
}

fun randomNumber(d: Double, d1: Double): Double {
    val random = Random()
    return random.nextDouble()
}

