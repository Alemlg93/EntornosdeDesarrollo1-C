package models;
import java.util.*;

public class Triangulo {

    public Triangulo() {
    
    }
     private int base;
     private int altura;
    
  
    public void Triangulo(int base, int altura) {
        this.base=base;
        this.altura=altura;
    }

    public void get(int altura) {
       
    }

    public void set(int altura) {
      
    }

    public int calcularArea() {
        return (base*altura)/2;
    }

    
}