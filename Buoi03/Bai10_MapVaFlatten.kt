// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

fun main() {
    // Phần 1: Dùng map để nhân đôi từng phần tử
    val dsSoNguyen = listOf(1, 2, 3, 4, 5)
    val dsNhanDoi = dsSoNguyen.map { it * 2 }

    println("--- PHẦN 1: DÙNG MAP ---")
    println("Danh sách gốc: $dsSoNguyen")
    println("Danh sách sau khi nhân đôi: $dsNhanDoi")

    // Phần 2: Dùng flatten để gộp danh sách lồng nhau
    val dsLongNhau = listOf(
        listOf(1, 2, 3),
        listOf(4, 5),
        listOf(6, 7, 8, 9)
    )
    val dsPhang = dsLongNhau.flatten()

    println("\n--- PHẦN 2: DÙNG FLATTEN ---")
    println("Danh sách lồng nhau: $dsLongNhau")
    println("Danh sách phẳng duy nhất: $dsPhang")
}