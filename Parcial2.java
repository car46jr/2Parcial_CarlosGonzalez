
package parcial2;
import java.util.Scanner;

public class Parcial2 {
    static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
    static int select = -1; //opción elegida del usuario
    static int num1 = 0, num2 = 0; //Variables
    private static double resultado;
    
    public static void main(String[] args) {
    Clase1 figura=new Clase1();
        //Mientras la opción elegida sea 0, preguntamos al usu
		while(select != 0){
			//Try catch para evitar que el programa termine si hay un error
			try {
				System.out.println("""
                                  Elige la figura geometrica a calcular:
                                  1-  Cuadrado
                                  2- Triangulo
                                  3- Ciruclo
                                  4- Rectangulo
                                  5- Rombo
                                  6- Paralelogramo
                                  0- Salir """);
				//Recoger una variable por consola
				select = Integer.parseInt(scanner.nextLine()); 
                                
				//switch case para menu de las clasess
				switch(select){
				case 1 -> {
                                  System.out.println("Introduce la altura :");
                                    num1 = Integer.parseInt(scanner.nextLine());
                                    System.out.println("\n El area del Cuadrado es: " + figura.resultado(num1));
                                    System.out.println("\n El perimetro del cuadrado es: " + figura.resultado(num1));
                                  break;
                                }
				case 2 -> {
                                        System.out.println("Introduce la altura :");
                                num1 = Integer.parseInt(scanner.nextLine());
                                System.out.println("Introduce la base:");
                                num2 = Integer.parseInt(scanner.nextLine()); 
                                }
                                case 3 ->{
                                    
                                }                              
                                case 4 -> {
                                   
                                }
				case 5 -> {
                                   
                                }
				case 6 -> {
                                   
                                }
				
                                }
				
				System.out.println("\n");
				
			}catch(NumberFormatException e){
				System.out.println("Error");
			}
                        }
                

	}
    


public static void ingresar(){


		
    }

} 
    
