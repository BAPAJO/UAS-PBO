/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bakery;

import Bahan.HargaPerGram;

/**
 *
 * @author acer
 */
public class TawarVar2 extends ModalAdonan {
    //Attribut
    public double keju = 80;
    
    
    //methods
    public double modalVar1(){
        return (this.keju * HargaPerGram.gramKeju()) + this.modalAdonan();
    } 
}
