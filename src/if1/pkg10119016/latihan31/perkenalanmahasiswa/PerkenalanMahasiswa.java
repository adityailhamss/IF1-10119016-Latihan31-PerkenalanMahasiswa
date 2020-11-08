/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119016.latihan31.perkenalanmahasiswa;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan biodata
 */
public class PerkenalanMahasiswa {
public String nim;
    public String nama;
    public void perkenalanDiri(){
        System.out.println("Hello everyone");
        System.out.println("My NIM is "+nim);
        System.out.println("My Name is "+nama+"\n");
    }
  
    public static void main(String[] args) {
      PerkenalanMahasiswa mhs = new PerkenalanMahasiswa();
       PerkenalanMahasiswa mhs1 = new PerkenalanMahasiswa();
       PerkenalanMahasiswa mhs2 = new PerkenalanMahasiswa();
       PerkenalanMahasiswa mhs3 = new PerkenalanMahasiswa();

        mhs.nim = "10119016";
        mhs.nama = "Orang";
        mhs.perkenalanDiri();

        mhs1.nim = "10119088";
        mhs1.nama = "Aditya";
        mhs1.perkenalanDiri();

        mhs2.nim = "10119023";
        mhs2.nama = "Ilham";
        mhs2.perkenalanDiri();

        mhs3.nim = "10119020";
        mhs3.nama = "Subagja";
        mhs3.perkenalanDiri();
    }
}
