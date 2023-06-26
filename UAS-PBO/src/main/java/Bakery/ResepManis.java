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
public class ResepManis extends HargaJual {
    //attributes
    public double TepungTerigu = 1000;
    public double GulaPasir = 150;
    public double Butter = 150;
    public double Ragi = 20;
    public double SusuBubuk = 300;
    public double SusuCair = 250;
    public double Telur = 80;
    public double EsBatu = 400;
    public double BeratPcs = 50;

    //methods adonan per pcs
    public double adonanTepungTerigu() {
        return this.TepungTerigu / this.BeratPcs;
    }
    public double adonanGulaPasir() {
        return this.GulaPasir / this.BeratPcs;
    }
    public double adonanButter() {
        return this.Butter / this.BeratPcs;
    }
    public double adonanRagi() {
        return this.Ragi / this.BeratPcs;
    }
    public double adonanSusuBubuk() {
        return this.SusuBubuk / this.BeratPcs;
    }
    public double adonanSusuCair() {
        return this.SusuCair / this.BeratPcs;
    }
    public double adonanTelur() {
        return this.Telur / this.BeratPcs;
    }
    public double adonanEsBatu() {
        return this.EsBatu / this.BeratPcs;
    }
    public double modalAdonan(){
        return (this.adonanTepungTerigu() * HargaPerGram.gramTepungTerigu() + (this.adonanGulaPasir()* HargaPerGram.gramGulaPasir()) + (this.adonanButter() * HargaPerGram.gramButter()) + (this.adonanRagi()) * HargaPerGram.gramRagi()) + (this.adonanSusuBubuk() * HargaPerGram.gramSusuBubuk()) + (this.adonanSusuCair() * HargaPerGram.gramSusuCair()) + (this.adonanTelur() * HargaPerGram.gramTelur()) + (this.adonanEsBatu() * HargaPerGram.gramEsBatu());
    }
}
