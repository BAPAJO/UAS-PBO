/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Bakery;

import java.util.Scanner;

/**
 *
 * @author bangu
 */
public class UASPBO {
    private int manisVarian1;
    private int manisVarian2;
    private int manisVarian3;
    private int tawarVarian1;
    private int tawarVarian2;
    private int pizzaVarian1;
    
    private Scanner scanner = new Scanner(System.in);
    private ManisVar1 manisVar1 = new ManisVar1();
    private ManisVar2 manisVar2 = new ManisVar2();
    private ManisVar3 manisVar3 = new ManisVar3();
    private TawarVar1 tawarVar1 = new TawarVar1();
    private TawarVar2 tawarVar2 = new TawarVar2();
    private PizzaVar1 pizzaVar1 = new PizzaVar1();
    
    
    public void input(){
        System.out.println("**********\nORDERAN\n**********");
        System.out.println("Roti manis  : ");
        System.out.print("    a. Varian 1 : ");
        manisVarian1 = scanner.nextInt();
        System.out.print("    b. Varian 2 : ");
        manisVarian2 = scanner.nextInt();
        System.out.print("    c. Varian 3 : ");
        manisVarian3 = scanner.nextInt();
        System.out.println("Roti tawar  : ");
        System.out.print("    a. Varian 1 : ");
        tawarVarian1 = scanner.nextInt();
        System.out.print("    b. Varian 2 : ");
        tawarVarian2 = scanner.nextInt();
        System.out.println("Pizza       : ");
        System.out.print("    a. Varian 1 : ");
        pizzaVarian1 = scanner.nextInt();
        
        output();
    }
    
    public void output(){
        if (manisVarian1 > 0) {
            System.out.println("Harga roti manis varian 1 : " + manisVar1.hargaVar1());
        }
    }
    
    public void hitung(){
        
    }

    public static void main(String[] args) {
        UASPBO order = new UASPBO();
        order.input();
    }
}
