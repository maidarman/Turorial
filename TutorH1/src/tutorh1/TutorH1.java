/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorh1;

import java.util.Scanner;

/**
 *
 * @author Maidarman
 */
public class TutorH1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Mahasiswa mhs = null;
      
       
       System.out.println("1. input mahasiswa ");
       System.out.println("2. output mahasiswa ");
       while(true){
           int opsi ;
           Scanner scanS = new Scanner(System.in);
           Scanner scanI = new Scanner(System.in);
           //opsi= new Scanner(System.in).nextInt();
           opsi = scanI.nextInt();
           if(opsi == 1){
              String nama, nim, kelas;
              nama = scanS.nextLine();
              nim = scanS.nextLine();
              kelas = scanS.nextLine();
              
              mhs = new Mahasiswa(nama,kelas,nim);
           }
           else if (opsi == 2)
           {
               System.out.println(mhs.getKelas());
               System.out.println(mhs.getNama());
               System.out.println(mhs.getNim());
           }
       }
       
       
        
    }
    
}
