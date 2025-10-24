package model;

import java.util.*;

public class manajemenGaji {
    ArrayList<karyawan> daftarKaryawan = new ArrayList<>();

    public void tambahKaryawan(karyawan Karyawan) {
        daftarKaryawan.add(Karyawan);
    }

    public void tampilkanTotalGaji() {
        System.out.println(" ___  ___   ___    ___  ___   ___    _____   _   _    ___    _____   _____  ");
        System.out.println("|  \\/  |  / _ \\  |  \\/  |  / _ \\  /  __ \\ | | | |  / _ \\  |  ___| |  ___| ");
        System.out.println("| .  . | / /_\\ \\ | .  . | / /_\\ \\ | /  \\/ | |_| | / /_\\ \\ | |_    | |__   ");
        System.out.println("| |\\/| | |  _  | | |\\/| | |  _  | | |     |  _  | |  _  | |  _|   |  __|  ");
        System.out.println("| |  | | | | | | | |  | | | | | | | \\__/\\ | | | | | | | | | |     | |___  ");
        System.out.println("\\_|  |_/ \\_| |_/ \\_|  |_/ \\_| |_/  \\____/ \\_| |_/ \\_| |_/ \\_|     \\____/  ");
        System.out.println("====================== Manajemen Gaji Karyawan Mama Chafe ====================== ");
        for (karyawan k : daftarKaryawan) {
            String tipe = k.getClass().getSimpleName();
            System.out.println("Nama: " + k.getNama());
            System.out.println("Tipe Karyawan: " + tipe);
            System.out.println("Gaji yang Diterima: Rp " + String.format("%,.0f", k.hitungGaji()));
            System.out.println("-------------------------------------------");
        }
    }
}
