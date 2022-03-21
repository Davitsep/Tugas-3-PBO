package Ruang;
import Bidang.*;

public class Balok extends PersegiPanjang  implements MenghitungRuang{
    private double tinggi, hasilVolume, hasilLuasPermukaan;

    public Balok(double panjang, double lebar, double tinggii){
        super(panjang , lebar);
        tinggi = tinggii;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2 * (super.hitungLuas() + (super.getLebar() * tinggi) + (super.getPanjang() * tinggi));
    }
}

