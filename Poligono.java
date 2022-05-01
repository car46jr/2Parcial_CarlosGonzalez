
package parcial2;


public class Poligono extends Clase1{
   public int numerLados;

    public Poligono(int numerLados) {
        this.numerLados = numerLados;
    }
    
   @Override
    public double resultado7(double base,int altura){
        int area= (int) ((base *altura)/2);
        return area;
    }
   @Override
   public double resultados7(int base,int numeroLados){
        var perimetro= (base*numeroLados);
        return perimetro;
}

    public int getNumerLados() {
        return numerLados;
    }

    public void setNumerLados(int numerLados) {
        this.numerLados = numerLados;
    }
   
}
