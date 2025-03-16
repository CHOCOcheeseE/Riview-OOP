public class Giro extends Rekening {
    double limitPenarikan;

    public Giro(String np, String nr, double saldo, double limitPenarikan) {
        super(np, nr, saldo);
        this.limitPenarikan = limitPenarikan;
    }

    @Override
    public void tarik(double jumlah) {
        if (jumlah > limitPenarikan) {
            System.out.println("Penarikan melebihi limit penarikan");
        } else {
            super.tarik(jumlah);
        }
    }

}
