
package parcial2;

public class Clase1 {
    //atributos
    public double base;
    public int altura;
    

    public double resultado1(double base){
        int area= (int) (base *base);
        return area;
        
    }
    public double resultado(int base){
        int perimetro= base* base* base *base;
        return perimetro;
}
//Triangulo
    public double resultado1(double base, int altura){
        int area= (int) ((base* altura)/2);
        return area;
    }
    public double resultado(int base, int altura, int his){
        int perimetro= base*altura*his;
        return perimetro;
}
  //Circulo
     public double resultado1(double r, double base){
     int area= (int)((int) Math.PI * Math.pow(base, 2));
     return area;}
    
    public double resultado(double r, double base){
     int perimetro= (int) (2*Math.PI*base);
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

