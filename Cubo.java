
package parcial2;


public class Cubo extends Clase1 {
    public int volumen;

    public Cubo(int volumen) {
        this.volumen = volumen;
    }
    
    @Override
     public double resultado8(double base){
        int area= (int) (6 * Math.pow(base, 2));
        return area;
        
    }
    @Override
    public double resultados8(int base){
        int perimetro= base* base* base;
        return perimetro;
}

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
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
