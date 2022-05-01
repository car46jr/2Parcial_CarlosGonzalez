
package parcial2;


public class Ciruculo extends Clase1 {
    public double r;

    public Ciruculo(int r) {
        this.r = r;
    }
    
    public double resultado(double base){
     int area= (int)((int) Math.PI * Math.pow(base, 2));
     return area;}
    
    @Override
    public double resultado(double r, double base){
     int perimetro= (int) (2*Math.PI*base);
     return perimetro;
}
    
}
