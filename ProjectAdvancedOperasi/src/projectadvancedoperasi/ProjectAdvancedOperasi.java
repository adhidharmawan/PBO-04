/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author User
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operasi A = new Operasi();
        System.out.println("a: "+ A.jumlahkan(3, 4));
        System.out.println("b: "+ A.jumlahkan(4, 7, -9));
        System.out.println("c: "+ A.jumlahkan(3.4, -0.002, 0.12313));
        
        Operasi B = new Operasi();
        System.out.println(B.perkalian(3, 4));
        System.out.println(B.perkalian(2, 0.5));
        System.out.println(B.perkalian(4, 3.3, 5));
    }
    
}
