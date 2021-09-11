fun main(){
    println("=================================")
    println("Game Suit Terminal Kotlin Version")
    println("=================================")

    val pemain1 = Pemain("Pemain 1")
    val pemain2 = Pemain("Pemain 2")

    pemain1.input()
    pemain2.input()

    val cekHasil=CekHasil(pemain1.nama,pemain1.nilai,pemain2.nama,pemain2.nilai)
    cekHasil.cek()

}