/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorh1;

/**
 *
 * @author Maidarman
 */
public class Mahasiswa {
    	String nim;
	String kelas; 
	String nama;
	String jurusan; 
	int IPK;
	int index_kebahagian;
        
    public Mahasiswa(String nama, String kelas, String nim){
        this.nama=nama;
        this.nim=nim;
        this.kelas=kelas;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setIPK(int IPK) {
        this.IPK = IPK;
    }

    public void setIndex_kebahagian(int index_kebahagian) {
        this.index_kebahagian = index_kebahagian;
    }

    public String getNim() {
        return nim;
    }

    public String getKelas() {
        return kelas;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public int getIPK() {
        return IPK;
    }

    public int getIndex_kebahagian() {
        return index_kebahagian;
    }
        
        
        
}
