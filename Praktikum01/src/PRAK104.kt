class laptop(var merk: String, var os: String, var ram: Int, var isSsd: Boolean, var color: String) {

}

fun main(){
    val laptop1 = laptop("Asus", "Windows", 4, true, "white")
    val laptop2 = laptop("Acer", "Windows", 8, true, "black")
    val laptop3 = laptop("Macbook", "Linux", 4, false, "white")

    print("""
        Merk Laptop: ${laptop1.merk}
        OS: ${laptop1.os}
        RAM: ${laptop1.ram}
        SSD: ${laptop1.isSsd}
        Color: ${laptop1.color}
        
        
    """.trimIndent())

    print("""
        Merk Laptop: ${laptop2.merk}
        OS: ${laptop2.os}
        RAM: ${laptop2.ram}
        SSD: ${laptop2.isSsd}
        Color: ${laptop2.color}
        
        
    """.trimIndent())

    print("""
        Merk Laptop: ${laptop3.merk}
        OS: ${laptop3.os}
        RAM: ${laptop3.ram}
        SSD: ${laptop3.isSsd}
        Color: ${laptop3.color}
        
        
    """.trimIndent())
}