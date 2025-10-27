public class ImparTest {
    public static void main(String[] args) {
        // Ahora sin crear objeto
        assertTrue(Impar.impar(2).equals("par"));
        System.out.println("Test pasó!");
    }
    
    public static void assertTrue(boolean condicion) {
        if (!condicion) throw new AssertionError("Falló el test");
    }
}