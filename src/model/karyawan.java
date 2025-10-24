package model;

public abstract class karyawan implements hitung {
    private String nama;
    private String nip;
    private String alamat;

    public karyawan(String nama, String nip, String alamat) {
        this.nama = nama;
        this.nip = nip;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public abstract double hitungGaji(); 
     
}
