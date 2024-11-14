package ejercicios.depuracion;

/* 
 * programa que lee un número n y muestra n asteriscos
 */
import java.util.*;
public class Ejemplo2While {
	
	public static int pedirNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		return sc.nextInt();
	}
	
    public static void main(String[] args) {
        int n, contador = 0;
        n = pedirNumero();
        while (contador< n){
               System.out.println(" * ");
               System.out.println("contador: "+ contador);
               contador++;
        }
    }
}

