
package parcial2;

public class Triangulo extends Clase1 {
    public double his;
    public int a;
    //Triangulo
    public Triangulo(double his){
        this.his=his;
       }
    
    @Override
  public double resultado1(double base, int altura){
        int area= (int) ((base* altura)/2);
        return area;
        
    }
    @Override
    public double resultado(int base, int altura, int his){
        int perimetro= base*altura*his;
        return perimetro;
}
}
