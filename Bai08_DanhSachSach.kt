// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

fun main() {
    // Khoi tao mutableListOf voi 5 cuon sach
    val dsSach = mutableListOf(
        "Lập trình Android với Kotlin",
        "Cấu trúc dữ liệu và giải thuật",
        "Sạch mã nguồn (Clean Code)",
        "Thiết kế hệ thống",
        "Tự học Python"
    )

    println("--- Danh sách ban đầu ---")
    dsSach.forEach { println("- $it") }

    // Thêm 2 cuốn sách mới
    dsSach.add("Lập trình Web với React")
    dsSach.add("Kiến trúc phần mềm")

    // Xóa 1 cuốn theo tên
    dsSach.remove("Tự học Python")

    // Sắp xếp theo thứ tự chữ cái bằng hàm có sẵn
    dsSach.sort()

    println("\n--- Danh sách sau khi thêm, xóa và sắp xếp ---")
    dsSach.forEach { println("- $it") }
}