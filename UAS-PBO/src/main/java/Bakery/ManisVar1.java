/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bakery;
import Bahan.*/

/**
 *
 * @author Safiira Hashifah
 */
public class ManisVar1 implements Bahan {
    //attributes
    public double keju = 5;
    public double coklat = 10;
    
    //methods
    public void modalVar1(){
        return (this.keju * hargaPerGram.gramKeju) + (this.coklat * hargaPerGram.gramCoklat) + modalAdonan();
    }
}
