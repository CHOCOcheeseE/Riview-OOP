public class Rekening {
    String namaPemilik;
    String noRekening;
    double saldo;

    public Rekening(String np, String nr, double saldo) {
        namaPemilik = np;
        noRekening = nr;
        this.saldo = saldo;

    }

    public void setor(double jumlah) {
        saldo += jumlah;
    }

    public void tarik(double jumlah) {
        saldo -= jumlah;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("No Rekening: " + noRekening);
        System.out.println("Saldo: " + saldo);
    }
}