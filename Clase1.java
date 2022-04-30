
package parcial2;

public class Clase1 {
    //atributos
    public double base;
    public int altura;
    
    //metodos 
 
    public double resultado1(double base){
        int area= (int) (base *base);
        return area;
        
    }
    public double resultado(int base){
        int perimetro= base* base* base *base;
        return perimetro;
}

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

   
    
}

