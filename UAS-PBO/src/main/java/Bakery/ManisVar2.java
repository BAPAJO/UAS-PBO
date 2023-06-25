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
public class ManisVar2 {
    //attribute
    public double selairedBean = 10;
    public double krimVanilla = 5;
    
    //methods
    public double modalVar2(){
        return (this.selairedBean * HargaPerGram.gramSelai()) + (this.krimVanilla * HargaPerGram.gramKrimVanilla) + this.modalAdonan();
    }
}
