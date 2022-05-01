
package parcial2;

public class Clase1 {
    //atributos
  protected double base;
  protected int altura;
    
//Cuadrado
    public double resultado1(double base){
        int area= (int) (base *base);
        return area;
        
    }
    public double resultado(int base){
        int perimetro= base* base* base *base;
        return perimetro;
}
//Triangulo
    public double resultado2(double base, int altura){
        int area= (int) ((base* altura)/2);
        return area;
    }
    public double resultado2(int base, int altura, int his){
        int perimetro= base*altura*his;
        return perimetro;
}
  //Circulo
     public double resultado3(double base){
     int area= (int)((int) Math.PI * Math.pow(base, 2));
     return area;}
    
    public double resultad3(double base,int g){
     int perimetro= (int) (2*Math.PI*base);
     return perimetro;
}
    //Rectangulo
       public double resultado4(int base,int altura){
        int area= (int) (base *altura);
        return area;
 
    }

    public double resultado4(int base,int altura, int j){
        var perimetro= 2*(base+altura);
        return perimetro;
}
    
    //Rombo
    public double resultado5(double base,int altura){
     int area= (int) ((base*altura)/2);
     return area;}
    
    public double resultado5(double base,int altura, int d1){
     int perimetro= (4*altura);
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

