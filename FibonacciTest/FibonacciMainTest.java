import junit.framework.TestCase;

public class FibonacciMainTest extends TestCase {

    public void testFibUdregner(){
        int resultat;
        //Tester for 5 i talrækken :)
        //input = 5
        //Forventet output = 15
        resultat = FibonacciMain.fibUdregner(5);
        assertEquals(15,resultat);

        //Tester for 10 i talrækken :)
        //input = 10
        //Forventet output = 55
        resultat = FibonacciMain.fibUdregner(10);
        assertEquals(55,resultat);

        //Tester for 20 i talrækken :)
        //input = 20
        //Forventet output = 120
        resultat = FibonacciMain.fibUdregner(20);
        assertEquals(120,resultat);

        //Tester for 40 i talrækken :)
        //input = 40
        //Forventet output = 820
        resultat = FibonacciMain.fibUdregner(40);
        assertEquals(820,resultat);

        //Tester for 11 i talrækken :)
        //input = 11
        //Forventet output = 66
        resultat = FibonacciMain.fibUdregner(11);
        assertEquals(66,resultat);

        //Tester for 17 i talrækken :)
        //input = 17
        //Forventet output = 153
        resultat = FibonacciMain.fibUdregner(17);
        assertEquals(153,resultat);

    }

}