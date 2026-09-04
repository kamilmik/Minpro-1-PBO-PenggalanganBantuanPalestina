package com.mycompany.minpropalestina;
/**
 *
 * @author AXIOO
 */
import model.Lembaga;
import model.BantuanDana;
import model.BantuanLogistik;
import java.util.ArrayList;
import java.util.Scanner;

public class MinproPalestina {

    public static void main(String[] args) {
        ArrayList<Lembaga> listLembaga = new ArrayList<>();
        listLembaga.add(new Lembaga("BAZNAS", "Indonesia", "11111"));
        listLembaga.add(new Lembaga("PMI", "Indonesia", "222222"));
        listLembaga.add(new Lembaga("UNICEF", "Internasional", "333333"));
        listLembaga.add(new Lembaga("NGO", "Internasional", "444444"));
        listLembaga.add(new Lembaga("INFORSA", "Samarinda", "555555"));
        listLembaga.add(new Lembaga("Aksi Bersama", "Indonesia", "66666"));

        ArrayList<BantuanDana> listDana = new ArrayList<>();
        ArrayList<BantuanLogistik> listLogistik = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("~~~SISTEM PENGGALANGAN BANTUAN PALESTINA~~~");
            System.out.println("1. Kelola Bantuan Dana");
            System.out.println("2. Kelola Bantuan Logistik");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            int pilihanUtama = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihanUtama) {
                case 1 -> {
                    boolean subMenuDana = true;
                    while (subMenuDana) {
                        System.out.println("\n~~~MENU BANTUAN DANA~~~");
                        System.out.println("1. Tambah Data");
                        System.out.println("2. Tampilkan Data");
                        System.out.println("3. Ubah Nominal");
                        System.out.println("4. Hapus Data");
                        System.out.println("5. Kembali");
                        System.out.print("Pilih (1-5): ");
                        int menuDana = scanner.nextInt();
                        scanner.nextLine();

                        switch (menuDana) {
                            case 1 -> {
                                System.out.print("ID Dana: ");
                                int id = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Nama Donatur: ");
                                String nama = scanner.nextLine();
                                System.out.print("Nominal: ");
                                double nominal = scanner.nextDouble();
                                scanner.nextLine();
                                
                                System.out.println("Pilih Lembaga Penyalur:");
                                for (int i = 0; i < listLembaga.size(); i++) {
                                    System.out.println((i + 1) + ". " + listLembaga.get(i).namaLembaga);
                                }
                                System.out.print("Pilihan (1-3): ");
                                int indexLembaga = scanner.nextInt() - 1;
                                scanner.nextLine();
                                
                                if (indexLembaga >= 0 && indexLembaga < listLembaga.size()) {
                                    listDana.add(new BantuanDana(id, nama, nominal, listLembaga.get(indexLembaga)));
                                    System.out.println(">> Alhamdulillah Berhasil ditambah");
                                } else {
                                    System.out.println("!! Maaf, Perintah salah");
                                }
                            }
                            case 2 -> {
                                if (listDana.isEmpty()) System.out.println("syafakillah Data kosong.");
                                for (int i = 0; i < listDana.size(); i++) listDana.get(i).tampilkanInfo();
                            }
                            case 3 -> {
                                System.out.print("ID Dana yang diubah: ");
                                int idTarget = scanner.nextInt();
                                scanner.nextLine();
                                boolean ketemu = false;
                                for (int i = 0; i < listDana.size(); i++) {
                                    if (listDana.get(i).idDana == idTarget) {
                                        System.out.print("Nominal Baru: ");
                                        listDana.get(i).nominal = scanner.nextDouble();
                                        scanner.nextLine();
                                        System.out.println(">> Alhamdulillah Berhasil diupdate");
                                        ketemu = true;
                                        break;
                                    }
                                }
                                if (!ketemu) System.out.println("ID tidak ditemukan.");
                            }
                            case 4 -> {
                                System.out.print("ID Dana yang dihapus: ");
                                int idTarget = scanner.nextInt();
                                scanner.nextLine();
                                boolean ketemu = false;
                                for (int i = 0; i < listDana.size(); i++) {
                                    if (listDana.get(i).idDana == idTarget) {
                                        listDana.remove(i);
                                        System.out.println(">> data dihapus");
                                        ketemu = true;
                                        break;
                                    }
                                }
                                if (!ketemu) System.out.println("ID tidak ditemukan.");
                            }
                            case 5 -> subMenuDana = false;
                        }
                    }
                }
                case 2 -> {
                    boolean subMenuLogistik = true;
                    while (subMenuLogistik) {
                        System.out.println("\n~~~MENU BANTUAN LOGISTIK~~~");
                        System.out.println("1. Tambah Data");
                        System.out.println("2. Tampilkan Data");
                        System.out.println("3. Ubah Berat");
                        System.out.println("4. Hapus Data");
                        System.out.println("5. Kembali");
                        System.out.print("Pilih (1-5): ");
                        int menuLogistik = scanner.nextInt();
                        scanner.nextLine();

                        switch (menuLogistik) {
                            case 1 -> {
                                System.out.print("ID Logistik: ");
                                int id = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Nama Barang: ");
                                String nama = scanner.nextLine();
                                System.out.print("Berat (Kg): ");
                                int berat = scanner.nextInt();
                                scanner.nextLine();
                                
                                System.out.println("Pilih Lembaga Penyalur:");
                                for (int i = 0; i < listLembaga.size(); i++) {
                                    System.out.println((i + 1) + ". " + listLembaga.get(i).namaLembaga);
                                }
                                System.out.print("Pilihan (1-3): ");
                                int indexLembaga = scanner.nextInt() - 1;
                                scanner.nextLine();
                                
                                if (indexLembaga >= 0 && indexLembaga < listLembaga.size()) {
                                    listLogistik.add(new BantuanLogistik(id, nama, berat, listLembaga.get(indexLembaga)));
                                    System.out.println(">> Alhamdulillah  Berhasil ditambah");
                                } else {
                                    System.out.println("!! maaf, Pilihan salah");
                                }
                            }
                            case 2 -> {
                                if (listLogistik.isEmpty()) System.out.println("Data kosong.");
                                for (int i = 0; i < listLogistik.size(); i++) listLogistik.get(i).tampilkanInfo();
                            }
                            case 3 -> {
                                System.out.print("ID Logistik yang diubah: ");
                                int idTarget = scanner.nextInt();
                                scanner.nextLine();
                                boolean ketemu = false;
                                for (int i = 0; i < listLogistik.size(); i++) {
                                    if (listLogistik.get(i).idLogistik == idTarget) {
                                        System.out.print("Berat Baru (Kg): ");
                                        listLogistik.get(i).beratKg = scanner.nextInt();
                                        scanner.nextLine();
                                        System.out.println(">> Alhamdulillah Berhasil diupdate");
                                        ketemu = true;
                                        break;
                                    }
                                }
                                if (!ketemu) System.out.println("ID tidak ditemukan.");
                            }
                            case 4 -> {
                                System.out.print("ID Logistik yang dihapus: ");
                                int idTarget = scanner.nextInt();
                                scanner.nextLine();
                                boolean ketemu = false;
                                for (int i = 0; i < listLogistik.size(); i++) {
                                    if (listLogistik.get(i).idLogistik == idTarget) {
                                        listLogistik.remove(i);
                                        System.out.println(">> Data dihapus");
                                        ketemu = true;
                                        break;
                                    }
                                }
                                if (!ketemu) System.out.println("ID tidak ditemukan.");
                            }
                            case 5 -> subMenuLogistik = false;
                        }
                    }
                }
                case 3 -> berjalan = false;
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}
