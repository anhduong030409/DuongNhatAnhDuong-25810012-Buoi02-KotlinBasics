// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

fun main() {
    val fibList = mutableListOf<Int>()
    var a = 0
    var b = 1

    while (a < 100) {
        fibList.add(a)
        val temp = a + b
        a = b
        b = temp
    }

    println("Dãy số Fibonacci nhỏ hơn 100:")
    // Dùng vòng lặp for để in chỉ số vị trí và giá trị
    for (index in fibList.indices) {
        println("Vị trí $index: ${fibList[index]}")
    }
}