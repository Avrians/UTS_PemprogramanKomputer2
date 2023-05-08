package serialisasi;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.Serializable;
import java.util.List;
import serialisasi.MahasiswaItem;

/**
 *
 * @author Avria
 */
public class Mahasiswa implements Serializable {
    private String id;
    private String jurusan;
    private List<MahasiswaItem> items;
    
    public void setId(String id) {
        this.id = id;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setItems(List<MahasiswaItem> items) {
        this.items = items;
    }


    @Override
    public String toString() {
        String produk, item = "";
        produk = "Data Mahasiswa: \r\n"
                + "Id Jurusan = " + id + "\r\n"
                + "Jurusan = " + jurusan + "\r\n"
                + "==========================\r\n"
                + "Daftar Mahasiswa:\r\n";
        item = items.stream().map((obj)
                -> obj.toString()).reduce(item, String::concat);
        return produk + item;
    }
}
