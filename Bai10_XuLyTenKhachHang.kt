// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

fun main() {
    val tenKhachHang1: String? = "Nguyễn Văn B"
    val tenKhachHang2: String? = null

    println("--- 1. Safe Call (?.) ---")
    println("Độ dài tên 1: ${tenKhachHang1?.length}")
    println("Độ dài tên 2: ${tenKhachHang2?.length}")

    println("\n--- 2. Toán tử Elvis (?:) ---")
    val tenHienThi1 = tenKhachHang1 ?: "Khách vãng lai"
    val tenHienThi2 = tenKhachHang2 ?: "Khách vãng lai"
    println("Tên hiển thị 1: $tenHienThi1")
    println("Tên hiển thị 2: $tenHienThi2")

    println("\n--- 3. Toán tử Not-Null Assertion (!!) ---")
    /*
     Ghi chú giải thích:
     Toán tử (!!) ép trình biên dịch tin rằng biến không bị null.
     Nếu biến thực sự bị null lúc runtime, chương trình sẽ crash vì lỗi NullPointerException.
     Vì vậy chỉ nên dùng (!!) khi khẳng định 100% biến chắc chắn khác null.
    */
    try {
        val tenChacChan: String = tenKhachHang1!!
        println("Tên khách hàng: $tenChacChan")

        val tenLoi: String = tenKhachHang2!! // Dòng này phát sinh lỗi
        println(tenLoi)
    } catch (e: NullPointerException) {
        println("Bắt được lỗi NullPointerException do dùng !! trên biến null!")
    }
}