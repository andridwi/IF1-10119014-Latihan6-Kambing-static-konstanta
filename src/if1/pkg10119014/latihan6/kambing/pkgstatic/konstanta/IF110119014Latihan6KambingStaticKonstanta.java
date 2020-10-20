/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan6.kambing.pkgstatic.konstanta;

/**
 *
 * @author Andri
 */
public class KambingStatic {

    //Nama_KAMBING sebagai Konstanta
    public static final string NAMA_KAMBING = "MIDUN";
    
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak" + Mamalia.jumlahKambing);
    }
    
}
