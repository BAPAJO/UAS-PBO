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
public class ModalManis extends ResepManis {
    public void modalAdonan(){
        return (this.adonanTepungTerigu() * HargaPerGram.gramTepungTerigu()) + (adonanGulaPasir * hargaPerGram.gramGulaPasir) + (adonanButter * hargaPerGram.gramButter) + (adonanRagi * hargaPerGram.gramRagi) + (adonanSusuBubuk * hargaPerGram.gramSusuBubuk) + (adonanSusuCair * hargaPerGram.gramSusuCair) + (adonanTelur * hargaPerGram.gramTelur) + (adonanEsBatu * hargaPerGram.gramEsBatu);
    }
}
