
package parcial2;


public class Ciruculo extends Clase1 {
    public double r;

    public Ciruculo(int r) {
        this.r = r;
    }
     @Override
    public double resultado3(double base){
     int area= (int)((int) Math.PI * Math.pow(base, 2));
     return area;}
    
    /**
     *
     * @param base
     * @param g
     * @return
     */
    public double resultado3( double base, int g){
     int perimetro= (int) (2*Math.PI*base);
     return perimetro;
}

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public int getAltura() {
        return altura;
    }

    @Override
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
}
