/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;

/**
 *
 * @author Avria
 */
public class MahasiswaItem  implements Serializable {
    String nama;
    int nim;
    String kelas;
    String alamat;
    String email;
    int noHP;
    int angkatan;
    
    public MahasiswaItem (String name, int nim2, String kelas2, int angktn, String email2,String alamat2, int nohp ){
        this.nama = name;
        this.nim = nim2;
        this.kelas = kelas2;
        this.alamat = alamat2;
        this.email = email2;
        this.noHP = nohp;
        this.angkatan = angktn;
    }

    
    @Override
    public String toString(){
        return "\r\nNama = " + nama + "\r\nNIM = " + nim 
               + "\r\nKelas = " + kelas + "\r\nAngkatan = " + angkatan
               + "\r\nEmail = " + email + "\r\nAlamat = " + alamat 
                + "\r\nNo HP = " + noHP + "\r\n";
    }
}
