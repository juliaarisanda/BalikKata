/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gits.pkg4;

import java.util.Scanner;

/**
 *
 * @author ZULIA ARISANDA
 */
public class BalikKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        StringBuffer BalikKata;
        
        System.out.print("Kata sebelum dibalik : ");
        BalikKata = new StringBuffer(input.nextLine());
        
        System.out.print("Kata sesudah dibalik : ");
        System.out.println(BalikKata.reverse());
        
        
    }
    
}
