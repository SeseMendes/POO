import java.util.*;

public class DesvioPadrao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n,soma=0,media=0,x,sub;
        float s,div,soma2=0;
        System.out.println("Write the size of array: ");
        n = entrada.nextInt();
        int[] vet = new int[n];

        for(int i=0;i<n;i++){
            System.out.printf("Write the %2d number: \n", (i+1));
            vet[i] = entrada.nextInt();
        }
        for(int i=0;i<n;i++){
            soma+=vet[i];
            media=soma/n;
        }
        for(int i=0;i<n;i++){
            sub = vet[i] - media;
            x = (int) Math.pow(sub,2);
            System.out.println("( " + vet[i] + "-" + media + " )" + "^ 2" + "=" + x);
            soma2+=x;
        }
        
        div=soma2/(n-1);
        s= (float) Math.sqrt(div);

        System.out.printf("S = %.2f", s);
        entrada.close();

    }
}