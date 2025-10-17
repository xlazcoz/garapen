//package ariketa2;

/**
 * Programa hau sortu hurrengo kodearekin. Exekutatu lerroz lerro ikusteko 
 * zein balio duen 'a' aldagaiak bueltaren iterazio bakoitzean eta amaieran.
 */
public class Debug2 {

    public static void main(String[] args) {

        int a = 10, b = 2;
        for (a = 2; a <= 300 && b < 20; a *= b) {
            a++;
        }

        System.out.println("Amaiera - a= " + a + " eta b= " + b);
    }
}
