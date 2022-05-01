
package parcial2;


public class Rectangulo extends Clase1 {
 int base;
 int altura;
   
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     *
     * @param base
     * @param altura
     * @param j
     * @return
     */
    public double resultado4(double base,int altura, int j){
        int area= (int) (base *altura);
        return area;
        
    }
 @Override
    public double resultado4(int base,int altura){
        int perimetro= (base+altura*2);
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
