import java.util.Scanner;

public class Impar {
    
    public static String impar(int zen){
        String valor = "";
        if(zen % 2 == 0) {
            valor = "par";
        } else {
            valor = "impar";
        }
        return valor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu zenbaki bat"); 
        
        if (sc.hasNextInt()) {
            int numero = sc.nextInt();
            
            // 1. Crear un objeto de la clase Impar
            Impar objetoImpar = new Impar(); 
            
            // 2. Usar el objeto para llamar a la funcion
            String emaitza = objetoImpar.impar(numero);
            
            // 3. Imprimir el resultado
            System.out.println(numero + " zenbakia " + emaitza + " da.");
        } else {
            String respuesta = sc.nextLine();
            System.out.println( respuesta + " Ez zenbaki egoki bat"); 
        }
        
        sc.close();
    }
}
