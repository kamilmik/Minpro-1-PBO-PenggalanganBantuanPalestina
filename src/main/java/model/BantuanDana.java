package model;

/**
 *
 * @author AXIOO
 */
public class BantuanDana {
    public int idDana;
    public String namaDonatur;
    public double nominal;
    public Lembaga lembagaPenyalur; 

    public BantuanDana(int idDana, String namaDonatur, double nominal, Lembaga lembagaPenyalur) {
        this.idDana = idDana;
        this.namaDonatur = namaDonatur;
        this.nominal = nominal;
        this.lembagaPenyalur = lembagaPenyalur;
    }

    public void tampilkanInfo() {
        System.out.println("-------------------------");
        System.out.println("ID Dana: " + idDana);
        System.out.println("Donatur: " + namaDonatur);
        System.out.println("Nominal: Rp" + nominal);
        System.out.println("Disalurkan olrh: " + lembagaPenyalur.namaLembaga + " (" + lembagaPenyalur.asalNegara + ")");
        System.out.println("-------------------------");
    }
}
