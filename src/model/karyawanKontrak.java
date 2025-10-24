package model;

public class karyawanKontrak extends karyawan {
    private int gajiPokok;
    private int bonusProyek;

    public karyawanKontrak(int gajiPokok, int bonusProyek, String nama, String nip, String alamat) {
        super(nama, nip, alamat);
        this.gajiPokok = gajiPokok;
        this.bonusProyek = bonusProyek;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + bonusProyek;
    }
    
}
