package model;

/**
 *
 * @author AXIOO
 */
public class BantuanLogistik {
    public int idLogistik;
    public String namaBarang;
    public int beratKg;
    public Lembaga lembagaPenyalur;

    public BantuanLogistik(int idLogistik, String namaBarang, int beratKg, Lembaga lembagaPenyalur) {
        this.idLogistik = idLogistik;
        this.namaBarang = namaBarang;
        this.beratKg = beratKg;
        this.lembagaPenyalur = lembagaPenyalur;
    }

    public void tampilkanInfo() {
        System.out.println("-------------------------");
        System.out.println("ID Logistik: " + idLogistik);
        System.out.println("Barang: " + namaBarang);
        System.out.println("Berat: " + beratKg + " Kg");
        System.out.println("Disalurkan oleh: " + lembagaPenyalur.namaLembaga + " (" + lembagaPenyalur.asalNegara + ")");
        System.out.println("-------------------------");
    }
}
