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
public class ManisVar1 extends ModalManis {
    //attributes
    public double keju = 5;
    public double coklat = 10;
    
    //methods 
    public double modalVar1(){
        return (this.keju * HargaPerGram.gramKeju()) + (this.coklat * HargaPerGram.gramCoklat()) + this.modalAdonan();
    }
    //hitung harga jual varian per pcs
    public double hargaVar1(){
        return this.modalVar1() * 140/100;
    }
}
