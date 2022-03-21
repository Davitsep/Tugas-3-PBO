package Bidang;

public class PersegiPanjang implements MenghitungBidang{
    private double panjang, lebar;
    public PersegiPanjang(double p, double l){
        panjang = p;
        lebar = l;
    }

    public void setPanjang(int p){
        panjang = p;
    }

    public void setLebar(int l){
        lebar = l;
    }
    public double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

