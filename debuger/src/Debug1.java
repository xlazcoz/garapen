//package ariketa2;

/**
 * Programa hau sortu hurrengo kodearekin. Exekutatu lerroz lerro ikusteko 
 * zein balio duen 'emaitza' aldagaiak adierazpen bakoitzean eta programa amaitzean.
 */
public class Debug1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 40;
        int d = 35;

        int emaitza = (a + b) / 2;
        emaitza = d * emaitza;
        emaitza += (c / 2);

        System.out.println("Emaitza hau da: " + emaitza);
    }
}
