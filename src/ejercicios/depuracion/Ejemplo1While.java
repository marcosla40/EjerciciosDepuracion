package ejercicios.depuracion;

import java.util.Scanner;
public class Ejemplo1While {
	private int suma, contador;
	
	public Ejemplo1While() {
		this.suma = 0;
		this.contador = 0;
	}
	
    public static void main(String[] args) {
        int suma = 0, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();
        while (num>= 0){
               suma = suma + num;
               System.out.print("Introduzca un número: ");
               num = sc.nextInt();
        }
        System.out.println("La suma es: " + suma );
    }
}

