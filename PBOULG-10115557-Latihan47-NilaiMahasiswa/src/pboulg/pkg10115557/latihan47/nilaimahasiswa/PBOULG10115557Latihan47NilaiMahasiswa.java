/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan47.nilaimahasiswa;

/**
 *
 * @author RyanJuan
 * NAMA              : RAYAN
 * KELAS             : PBOULG
 * NIM               : 10115557
 * Deskripsi Program : Menampilkan Program hasil nilai akhir Mahasiswa
 */
public class PBOULG10115557Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    NilaiMahasiswa nilaiMhs = new NilaiMahasiswa();
        nilaiMhs.setNilaiQuis(75);
        nilaiMhs.setNilaiUts(45);
        nilaiMhs.setNilaiUas(34);
        System.out.println("QUIZ \t\t= "+nilaiMhs.getNilaiQuis());
        System.out.println("UTS \t\t= "+nilaiMhs.getNilaiUts());
        System.out.println("UAS \t\t= "+nilaiMhs.getNilaiUas());
        System.out.println("");
        System.out.println("Nilai Akhir \t= "+nilaiMhs.nilaiAkhir
        (nilaiMhs.getNilaiQuis(),nilaiMhs.getNilaiUts(),nilaiMhs.getNilaiUas()));
        System.out.println("");
        System.out.println("Index \t= "+nilaiMhs.index(nilaiMhs.nilaiAkhir(
                nilaiMhs.getNilaiQuis(),nilaiMhs.getNilaiUts(),
                nilaiMhs.getNilaiUas())));
   
        System.out.println("Keterangan = "+nilaiMhs.keterangan
        (nilaiMhs.index(nilaiMhs.nilaiAkhir(
                nilaiMhs.getNilaiQuis(),nilaiMhs.getNilaiUts(),
                nilaiMhs.getNilaiUas()))));
    
    }  
    
}
