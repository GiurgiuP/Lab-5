package testeProb2;

import Prob2.PerecheNumere;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteProb2
{
    @Test
    public void testFibo()
    {
        PerecheNumere pn1 = new PerecheNumere(0, 1);
        assertTrue(pn1.esteFibo());

        PerecheNumere pn2 = new PerecheNumere(8, 13);
        assertTrue(pn2.esteFibo());

        PerecheNumere pn3 = new PerecheNumere(4, 10);
        assertFalse(pn3.esteFibo());
    }

    @Test
    public void testCmmmc()
    {
        PerecheNumere pn1 = new PerecheNumere(4, 6);
        assertEquals(12, pn1.cmmmc());

        PerecheNumere pn2 = new PerecheNumere(3, 5);
        assertEquals(15, pn2.cmmmc());

        PerecheNumere pn3 = new PerecheNumere(15, 20);
        assertEquals(60, pn3.cmmmc());
    }

    @Test
    public void testSuma()
    {
        PerecheNumere pn1 = new PerecheNumere(123, 231);
        assertTrue(pn1.sumacif());

        PerecheNumere pn2 = new PerecheNumere(456, 654);
        assertTrue(pn2.sumacif());

        PerecheNumere pn3 = new PerecheNumere(123, 234);
        assertFalse(pn3.sumacif());
    }

    @Test
    public void testNumarCifrePare()
    {
        PerecheNumere pn1 = new PerecheNumere(246, 0);
        assertEquals(3, pn1.numarCifrePare(246));

        PerecheNumere pn2 = new PerecheNumere(1357, 0);
        assertEquals(0, pn2.numarCifrePare(1357));

        PerecheNumere pn3 = new PerecheNumere(840, 0);
        assertEquals(3, pn3.numarCifrePare(840));
    }


}
