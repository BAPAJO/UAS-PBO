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
public class ManisVar2 extends ModalManis {
    //attributes
    public double selaiRedBean = 10;
    public double krimVanilla = 5;
    
    //methods
    public double modalVar2(){
        return (this.selaiRedBean * HargaPerGram.gramSelaiRedBean()) + (this.krimVanilla * HargaPerGram.gramKrimVanilla()) + this.modalAdonan();
    }
    //hitung harga jual varian per pcs
    public double hargaVar1(){
        return this.modalVar2() * 140/100;
    }
}
