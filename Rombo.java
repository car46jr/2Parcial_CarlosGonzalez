
package parcial2;

public class Rombo extends Clase1 {
    public double d1;
    public int d2;

    public Rombo(int d1, int d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
    
    @Override
    public double resultado5(double base, int altura){
     int area= (int) (((base*altura)/2));
     return area;}
    
    @Override
    public double resultado5(double base,int altura, int d1){
     int perimetro= (4*altura);
     return perimetro;
}
}
