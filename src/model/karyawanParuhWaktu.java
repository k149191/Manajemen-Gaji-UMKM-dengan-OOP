package model;

public class karyawanParuhWaktu extends karyawan {
    private int jamKerja;
    private int tarifPerJam;

    public karyawanParuhWaktu(int jamKerja, int tarifPerJam, String nama, String nip, String alamat) {
        super(nama, nip, alamat);
        this.jamKerja = jamKerja;
        this.tarifPerJam = tarifPerJam;
    }
    
    @Override
    public double hitungGaji() {
       return jamKerja * tarifPerJam;
    }
    
}
