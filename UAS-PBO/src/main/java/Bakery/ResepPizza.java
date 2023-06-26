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
public class ResepPizza {
    public double TepungTerigu = 1000;
    public double Gula = 125;
    public double Butter = 100;
    public double Ragi = 20;
    public double SusuBubuk = 250;
    public double SusuCair = 200;
    public double Telur = 70;
    public double EsBatu = 300;
    public double Keju = 80;
    public double Coklat = 80;
    public double BeratPcs = 400;

    //Method Adonan
    public double adonanTepungTerigu() {
        return this.TepungTerigu / this.BeratPcs;
    }
    public double adonanGulaPasir() {
        return this.Gula / this.BeratPcs;
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
    public double adonanKeju() {
        return this.Keju / this.BeratPcs;
    }
    public double adonanCoklat() {
        return this.Coklat / this.BeratPcs;
    }
     public double modalAdonan(){
        return (this.adonanTepungTerigu() * HargaPerGram.gramTepungTerigu() + (this.adonanGulaPasir()* HargaPerGram.gramGulaPasir()) + (this.adonanButter() * HargaPerGram.gramButter()) + (this.adonanRagi()) * HargaPerGram.gramRagi()) + (this.adonanSusuBubuk() * HargaPerGram.gramSusuBubuk()) + (this.adonanSusuCair() * HargaPerGram.gramSusuCair()) + (this.adonanTelur() * HargaPerGram.gramTelur()) + (this.adonanEsBatu() * HargaPerGram.gramEsBatu());
}
}

