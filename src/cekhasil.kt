class CekHasil(var namaPemain1:String, var nilaiPemain1:String, var namaPemain2:String, var nilaiPemain2: String){
    lateinit var hasil: String

    fun cek(): Unit {
        if (nilaiPemain1 == "Batu" && nilaiPemain2 == "Batu") {
            hasil = "Seri"
        }
        if (nilaiPemain1 == "Batu" && nilaiPemain2 == "Kertas") {
            hasil= namaPemain2
        }
        if (nilaiPemain1 == "Batu" && nilaiPemain2 == "Gunting") {
            hasil= namaPemain1
        }
        if (nilaiPemain1 == "Kertas" && nilaiPemain2 == "Batu") {
            hasil= namaPemain1
        }
        if (nilaiPemain1 == "Kertas" && nilaiPemain2 == "Kertas") {
            hasil= "Seri"
        }
        if (nilaiPemain1 == "Kertas" && nilaiPemain2 == "Gunting") {
            hasil= namaPemain2
        }
        if (nilaiPemain1 == "Gunting" && nilaiPemain2 == "Batu") {
            hasil= namaPemain2
        }
        if (nilaiPemain1 == "Gunting" && nilaiPemain2 == "Kertas") {
            hasil= namaPemain1
        }
        if (nilaiPemain1 == "Gunting" && nilaiPemain2 == "Gunting") {
            hasil= "Seri"
        }

        println("Hasil:")
        if(hasil=="Seri"){
            println("Seri")
        }else {
            println("pemenang $hasil")
        }
    }
}