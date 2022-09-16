import java.util.*;

public class CalculadoraSimples {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float n1,n2,sum,sub,div, mult;
        char sign;

        System.out.println("Type the desired operation: ");
        n1 = entrada.nextFloat();
        sign = entrada.next().charAt(0);
        n2 = entrada.nextFloat();
        
       
        switch (sign){
            case '+':
                sum=n1+n2;
                System.out.printf("Result: %.2f", sum);
                break;
            case '-':
                sub=n1-n2;
                System.out.printf("Result: %.2f", sub);
                break;
            case  '*':
                mult=n1*n2;
                System.out.printf("Result: %.2f", mult);
                break;
            case '/':
                if(n2==0){
                    System.out.println("Zero denominator, division impossible!");
                    System.exit(0);
                }
                else {
                    div=n1/n2;
                    System.out.printf("Result: %.2f", div);
                    break;
                }
            default:
                System.out.println("Invalid operator");
                break;
        }
        entrada.close();

    }

}