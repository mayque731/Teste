import static org.junit.Assert.assertEquals;

import org.junit.Test;

//Mayque Pereira Oliveira
//IFRO
public class App {
    public static void main(String[] args) throws Exception {
        
    System.out.println("Testes de sofware");
    }

    //Um método que calcule a multiplicação de dois números
    public static double Mult(double n1, double n2){ 
        return n1*n2;
    }
    
    //Um método que verifique se um número é par
    public static boolean par(double n){
        
        if(n%2==0)
        return true;
         else 
        return false;
    }
    
    //Um método que calcule a área de um triangulo
    public static double at(double b, double a){
        return (a*b)/2;
    }

    //Um método que calcule o diâmetro da circunferência de um círculo
    public static double dc(double r){
        return 2*r;
    }

    //testes
    @Test
    public void testPar(){
       assertEquals(true, par(10));
    }
   
    @Test
    public void testMult(){
        assertEquals(18, Mult(6, 3), 0);
        ;
    }

    @Test
    public void testAt(){
        assertEquals(25, at(10,5), 0);
    }

    @Test
    public void testDc(){
        assertEquals(10, dc(5), 0);
    }
}

