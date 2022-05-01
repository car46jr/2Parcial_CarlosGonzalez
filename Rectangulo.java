
package parcial2;


public class Rectangulo extends Clase1 {
 int base;
 int altura;
   
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

 @Override
    public double resultado1(double base,int altura){
        int area= (int) (base *altura);
        return area;
        
    }
 @Override
    public double resultado(int base,int altura){
        int perimetro= 2*(base+altura);
        return perimetro;
}


 @Override
    public void setBase(int base) {
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
