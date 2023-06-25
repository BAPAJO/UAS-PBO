/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bakery;

import Bahan.HargaPerGram;

/**
 *
 * @author Asus
 */
public class PizzaVar1 {
     //attributes
    public double keju =  30;
    public double sosis = 50;
    public double smokedBeef = 50;
    public double bawangBombay = 30;
    
    //methods
    public double modalVar2(){
        return ((this.keju * HargaPerGram.gramKeju()) + (this.sosis * HargaPerGram.gramSosis()) + (this.smokedBeef * HargaPerGram.gramSmokedBeef()) + (this.bawangBombay * HargaPerGram.gramBawangBombay()) );
    }
}
