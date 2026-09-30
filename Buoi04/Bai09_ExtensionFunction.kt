// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

// Extension function đếm nguyên âm cho String
fun String.demNguyenAm(): Int {
    val nguyenAm = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    return this.count { it in nguyenAm }
}

// Extension function kiểm tra số nguyên tố cho Int
fun Int.laSoNguyenTo(): Boolean {
    if (this < 2) return false
    for (i in 2..Math.sqrt(this.toDouble()).toInt()) {
        if (this % i == 0) return false
    }
    return true
}

fun main() {
    println("--- Kiểm tra Extension demNguyenAm() ---")
    val str1 = "Kotlin"
    val str2 = "Android Mobile"
    val str3 = "Fly"
    println("'$str1' có ${str1.demNguyenAm()} nguyên âm")
    println("'$str2' có ${str2.demNguyenAm()} nguyên âm")
    println("'$str3' có ${str3.demNguyenAm()} nguyên âm")

    println("\n--- Kiểm tra Extension laSoNguyenTo() ---")
    val num1 = 7
    val num2 = 10
    val num3 = 13
    println("$num1 là số nguyên tố?: ${num1.laSoNguyenTo()}")
    println("$num2 là số nguyên tố?: ${num2.laSoNguyenTo()}")
    println("$num3 là số nguyên tố?: ${num3.laSoNguyenTo()}")
}