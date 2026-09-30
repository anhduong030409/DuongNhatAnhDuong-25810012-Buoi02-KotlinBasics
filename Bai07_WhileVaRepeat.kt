// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

fun main() {
    println("--- Đếm ngược từ 10 về 1 bằng while ---")
    var count = 10
    while (count >= 1) {
        println("Số: $count")
        count--
    }

    println("\n--- In dòng cố định 5 lần bằng repeat ---")
    repeat(5) { index ->
        println("Lần ${index + 1}: Học Kotlin rất thú vị!")
    }
}