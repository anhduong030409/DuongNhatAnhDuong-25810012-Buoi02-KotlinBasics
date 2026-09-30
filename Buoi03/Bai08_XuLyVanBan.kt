// Họ và tên: Dương Nhật Ánh Dương - MSSV: 25810012

// Higher order function
fun xuLyVanBan(vanBan: String, hamXuLy: (String) -> String): String {
    return hamXuLy(vanBan)
}

// Hàm đã đặt tên riêng để dùng cho cách 2
fun chuyenInHoa(s: String): String {
    return s.uppercase()
}

fun main() {
    val vanBanGoc = "kotlin programming"

    // Cách 1: Truyền lambda viết trực tiếp tại chỗ trong ngoặc đơn
    val kq1 = xuLyVanBan(vanBanGoc, { text -> text.replace(" ", "_") })
    println("Cách 1 (Thay khoảng trắng bằng _): $kq1")

    // Cách 2: Truyền hàm đã đặt tên riêng thông qua toán tử ::
    val kq2 = xuLyVanBan(vanBanGoc, ::chuyenInHoa)
    println("Cách 2 (Chuyển in hoa bằng ::): $kq2")

    // Cách 3: Dùng cú pháp Trailing Lambda (đưa lambda ra ngoài ngoặc đơn)
    val kq3 = xuLyVanBan(vanBanGoc) { text ->
        "*** $text ***"
    }
    println("Cách 3 (Trailing Lambda): $kq3")
}