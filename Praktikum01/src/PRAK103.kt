import java.util.Scanner

fun main(){
    var angka = 0
    val input = Scanner(System.`in`)

    print("Input Bilangan = ")
    angka = input.nextInt()

    for (i in 1..5) {
        if ((angka * i) % 2 == 0 || (angka * i) % 3 == 0){
            print(angka * i)
            print(" ")
        }
    }
}