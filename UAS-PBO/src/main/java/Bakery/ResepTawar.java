/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bakery;

/**
 *
 * @author acer
 */
public class ResepTawar {
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
    public void adonanTepungTerigu() {
        return this.TepungTerigu / this.BeratPcs;
    }
    public void adonanGula() {
        return this.Gula / this.BeratPcs;
    }
    public void adonanButter() {
        return this.Butter / this.BeratPcs;
    }
    public void adonanRagi() {
        return this.Ragi / this.BeratPcs;
    }
    public void adonanSusuBubuk() {
        return this.SusuBubuk / this.BeratPcs;
    }
    public void adonanSusuCair() {
        return this.SusuCair / this.BeratPcs;
    }
    public void adonanTelur() {
        return this.Telur / this.BeratPcs;
    }
    public void adonanEsBatu() {
        return this.EsBatu / this.BeratPcs;
    }
    public void adonanKeju() {
        return this.Keju / this.BeratPcs;
    }
    public void adonanCoklat() {
        return this.Coklat / this.BeratPcs;
    }
}
