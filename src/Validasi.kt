fun validasi(nilaiPemain:String):Boolean {
    return if (nilaiPemain != "Gunting" && nilaiPemain != "Batu" &&
        nilaiPemain != "Kertas"){
        println("")
        println("Inputan salah")
        println("Silahkan input kembali!!")
        println("")
        false
    } else {
        true
    }

}