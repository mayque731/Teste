import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double n1 ,n2;
        int opc=1;
        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Insira o primeiro numero");
            n1 = leia.nextDouble();

            System.out.println("Insira o segundo numero");
            n2 = leia.nextDouble();

            System.out.println("Selecione uma operação:");
            System.out.println("1-Soma");
            System.out.println("2-Subtração");
            System.out.println("3-Divisão");
            System.out.println("4-Multiplicação");

            opc = leia.nextInt();
        }


        switch(opc){
            case 1: System.out.println("Resultado da soma: " +Soma(n1,n2)); 
            break;
            case 2: System.out.println("Resultado da subtração: " +Sub(n1,n2));
            break;
            case 3: System.out.println("Resultado da divisao: " +Div(n1,n2));
            break;
            case 4: System.out.println("Resultado da multiplicação: " +Mult(n1,n2));
            break;
        }
    }

    public static double Soma(double n1, double n2){
        return n1+n2;
    }
    
    public static double Sub(double n1, double n2){
        return n1-n2;
    }

    public static double Div(double n1, double n2){
        return n1/n2;
    }

    public static double Mult(double n1, double n2){
        return n1*n2;
    }
}
