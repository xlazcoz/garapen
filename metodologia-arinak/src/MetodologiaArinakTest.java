import static org.junit.Assert.assertEquals;

import org.junit.*;


public class MetodologiaArinakTest {
    @Test
    public void Testagurra(){
        String adios = MetodologiaArinak.adios();
        assertEquals("kaixo ze laburpen ikusi nahi duzu" , adios);
    }
}
