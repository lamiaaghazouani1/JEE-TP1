package metier;

import org.junit.Assert;

public class CalculTest {
    private Calcul calcul;
    public void TestSomme(){
        calcul=new Calcul();
        double a=5; double b=9;
        double expected=14;
        double res=calcul.somme(a,b);
        Assert.assertTrue(res==expected);
    }
}
