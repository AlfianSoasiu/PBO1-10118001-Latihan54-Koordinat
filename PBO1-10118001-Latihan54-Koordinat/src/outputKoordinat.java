/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama      : Alfian Soasiu
 * Kelas     : PBO1
 * NIM       : 10118001
 * Deskripsi : Menampilkan output koordinat
 */
public class outputKoordinat {

    
    public static void main(String[] args) {
        
        WarnaKoordinat wKoordinat = new WarnaKoordinat (10,4,"Jingga");
        System.out.println("Warna Koordinat : "+wKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+wKoordinat.getX()+", y : "+wKoordinat.getY());
    }
    
}
