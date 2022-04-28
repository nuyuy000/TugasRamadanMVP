package com.example.tugasramadhanmvp

class MainViewPresenter(private val view: MainView) : MainPresenter {

    override fun penjumlahan(jumlahBilangan: JumlahBilangan) {
        val hasilakhir = jumlahBilangan.bil1+jumlahBilangan.bil2
        view.hasil(hasilakhir)
        view.clear()
    }

    override fun pengurangan(jumlahBilangan: JumlahBilangan) {
        val hasilakhir = jumlahBilangan.bil1-jumlahBilangan.bil2
        view.showToast(hasilakhir.toString())
    }
}