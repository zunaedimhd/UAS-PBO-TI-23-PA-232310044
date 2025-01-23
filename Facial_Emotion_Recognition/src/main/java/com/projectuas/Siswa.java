package com.projectuas;

public class Siswa {
    private String id;
    private String nama;
    private int usia;
    private String emosi;

    // Constructor
    public Siswa(String id, String nama, int usia) {
        this.id = id;
        this.nama = nama;
        this.usia = usia;
        this.emosi = "Tidak terdeteksi";
    }

    // Getter dan Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getEmosi() {
        return emosi;
    }

    public void setEmosi(String emosi) {
        this.emosi = emosi;
    }

    // Method untuk menampilkan data siswa
    public void tampilkanInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Emosi Terakhir: " + emosi);
    }
}