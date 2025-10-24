package main;

import model.*;

public class mamaChafe {
    public static void main(String[] args) {
        karyawanKontrak k1 = new karyawanKontrak(3000000,500000, "Lisa", "KK00001", "Jl. Patin No.59");
        karyawanParuhWaktu k2 = new karyawanParuhWaktu(100, 15000, "Liya", "KP00001", "Jl. Nila No.01");

        manajemenGaji manajemen = new manajemenGaji();
        manajemen.tambahKaryawan(k1);
        manajemen.tambahKaryawan(k2);

        manajemen.tampilkanTotalGaji();     
    }
}
