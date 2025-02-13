package com.example;

public class Carta {
   private int numero;
   private String naipe;
   
public Carta(int numero, String naipe) {
    this.numero = numero;
    this.naipe = naipe;
}
public String imagePath(){
 return "Classic-cards/" + numero + naipe + "png";   
}

public int getNumero() {
    return numero;
}

public String getNaipe() {
    return naipe;
}

}
