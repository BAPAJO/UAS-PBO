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
    private int ordManisVarian1;
    private int ordManisVarian2;
    private int ordManisVarian3;
    private int ordTawarVarian1;
    private int ordTawarVarian2;
    private int ordPizzaVarian1;
    
    private Scanner scanner = new Scanner(System.in);
    private ManisVar1 manisVar1 = new ManisVar1();
    private ManisVar2 manisVar2 = new ManisVar2();
    private ManisVar3 manisVar3 = new ManisVar3();
    private TawarVar1 tawarVar1 = new TawarVar1();
    private TawarVar2 tawarVar2 = new TawarVar2();
    private PizzaVar1 pizzaVar1 = new PizzaVar1();
    private ResepManis resepManis = new ResepManis();
    private ResepTawar resepTawar = new ResepTawar();
    private ResepPizza resepPizza = new ResepPizza();
    
    
    public void input(){
        System.out.println("**********\nORDERAN\n**********");
        System.out.println("Roti manis  : ");
        System.out.print("    a. Varian 1 : ");
        ordManisVarian1 = scanner.nextInt();
        System.out.print("    b. Varian 2 : ");
        ordManisVarian2 = scanner.nextInt();
        System.out.print("    c. Varian 3 : ");
        ordManisVarian3 = scanner.nextInt();
        System.out.println("Roti tawar  : ");
        System.out.print("    a. Varian 1 : ");
        ordTawarVarian1 = scanner.nextInt();
        System.out.print("    b. Varian 2 : ");
        ordTawarVarian2 = scanner.nextInt();
        System.out.println("Pizza       : ");
        System.out.print("    a. Varian 1 : ");
        ordPizzaVarian1 = scanner.nextInt();
        
        output();
    }
    
    public void output(){
        if (ordManisVarian1 > 0) {
            manis();
            System.out.println("Harga roti manis varian 1 per pcs : " + manisVar1.hargaManisVar1());
        }
        
    }
    
    public void manis(){
        System.out.println("Bahan yang diperlukan : ");
            System.out.println("    1. Tepung Terigu    : " + resepManis.adonanTepungTerigu() * ordManisVarian1 + "gram");
            System.out.println("    2. Gula Pasir       : " + resepManis.adonanGulaPasir() * ordManisVarian1 + "gram");
            System.out.println("    3. Butter           : " + resepManis.adonanButter() * ordManisVarian1 + "gram");
            System.out.println("    4. Ragi             : " + resepManis.adonanRagi() * ordManisVarian1 + "gram");
            System.out.println("    5. Susu Bubuk       : " + resepManis.adonanSusuBubuk() * ordManisVarian1 + "gram");
            System.out.println("    6. Susu Cair        : " + resepManis.adonanSusuCair() * ordManisVarian1 + "gram");
            System.out.println("    7. Telur            : " + resepManis.adonanTelur() * ordManisVarian1 + "gram");
            System.out.println("    8. Es Batu          : " + resepManis.adonanEsBatu() * ordManisVarian1 + "gram");
    }
    public static void main(String[] args) {
        UASPBO order = new UASPBO();
        order.input();
    }
}
