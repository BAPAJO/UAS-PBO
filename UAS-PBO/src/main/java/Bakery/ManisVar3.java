/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bakery;

import Bahan.HargaPerGram;

/**
 *
 * @author Safiira Hashifah
 */
public class ManisVar3 extends ModalAdonan {
    //attributes
    public double keju = 10;
    public double sosis = 10;
    
    //methods
    public double modalVar3(){
        return (this.keju * HargaPerGram.gramKeju()) + (this.sosis * HargaPerGram.gramSosis()) + this.modalAdonan();
    }
    //hitung harga jual varian per pcs
    public double hargaVar1(){
        return this.modalVar3() * 140/100;
    }
}
