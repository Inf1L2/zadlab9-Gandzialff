package pl.edu.ur.oopl9;

public class Samochod {
    private String marka;
    private String nazwa;
    private double pojemnosc_silnika;
    private int max_predkosc;
    private double cena;

    public Samochod(String marka, String nazwa, double pojemnosc_silnika, int max_predkosc, double cena) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnosc_silnika = pojemnosc_silnika;
        this.max_predkosc = max_predkosc;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getPojemnosc_silnika() {
        return pojemnosc_silnika;
    }

    public void setPojemnosc_silnika(double pojemnosc_silnika) {
        this.pojemnosc_silnika = pojemnosc_silnika;
    }

    public int getMax_predkosc() {
        return max_predkosc;
    }

    public void setMax_predkosc(int max_predkosc) {
        this.max_predkosc = max_predkosc;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "Marka='" + marka + '\'' +
                ", Nazwa='" + nazwa + '\'' +
                ", Pojemnosc silnika=" + pojemnosc_silnika +
                ", Prędkość maksymalna=" + max_predkosc +
                ", Cena=" + cena +
                '}';
    }
}
