
package parcial2;

public class Paralelogramo extends Clase1{
    public int interior;

    public Paralelogramo(int interior) {
        this.interior = interior;
    }
    
    @Override
     public double resultado6(double base,int altura){
        int area= (int) (base *altura);
        return area;
 
    }

    @Override
    public double resultados(int base,int altura){
        var perimetro= (base+altura*2);
        return perimetro;
}

    public int getInterior() {
        return interior;
    }

    public void setInterior(int interior) {
        this.interior = interior;
    }
    
}
   