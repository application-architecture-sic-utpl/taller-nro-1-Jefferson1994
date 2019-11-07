package ec.edu.utpl.sic.arqapl.tests;

import ec.edu.utpl.sic.arqapl.Manejador;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestAlgoritmos {
    @Test
    public void Testjacar() {
        var algorithm= Manejador.defineAlgo("jaccard");
        var tweet1 = "Hola";
        var tweet2 = "Hola";
        assertEquals(1.0,
                algorithm.similarity(tweet1, tweet2), 0.1);
    }
    @Test
    public void Testcosine(){
        var algorithm= Manejador.defineAlgo("cosine");
        var tweet1 = "Hola";
        var tweet2 = "Hola";
        assertEquals(1.0,
                algorithm.similarity(tweet1, tweet2), 0.1);
    }


    @Test
    public void TestJaroWinkelS(){
        var algorithm= Manejador.defineAlgo("jarowinkel");
        var tweet1 = "Hola";
        var tweet2 = "Hola";
        assertEquals(1.0,
                algorithm.similarity(tweet1, tweet2), 0.1);
    }
}
