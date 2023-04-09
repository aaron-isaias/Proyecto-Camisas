package com.mycompany.tienda;

public class Camisas {
    

    public int camisaCort(int num1){
        int camco = 190;
        int total1 = camco * num1;
        return total1; 
    }
    public int camisaCas(int num2){
        int camca = 230;
        int total2 = camca * num2;
        return total2; 
    }
    public int camisaFor(int num3){
        int camfo = 310;
        int total3 = camfo * num3;
        return total3; 
    } 
    public int SumCam(int num1, int num2, int num3){
        int sumacam = num1 + num2 + num3;
        return sumacam;
    }
}