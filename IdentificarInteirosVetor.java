import java.util.*;

public class IdentificarInteirosVetor {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num,even=0,odd=0,neutral=0,positive=0,negative=0;
        System.out.println("Write the size of array: ");
        num = entrada.nextInt();
        int[] vet = new int[num];

        for(int i=0;i<num;i++){
            System.out.printf("Write the number %2d: ", (i+1));
            vet[i] = entrada.nextInt();
        }

        for (int i = 0; i<num ; i++){
            if(vet[i] % 2 == 0)
                even++;
            if (vet[i] % 2 != 0)
                odd++;
            if (vet[i]>0)
                positive++;
            if(vet[i]<0)
                negative++;
            if(vet[i]==0)
                neutral++;
        }

        System.out.println(even + " pairs\n" + odd +" odd\n"+ positive + " positive\n"+negative + " negative\n"+neutral + " neutral");
        entrada.close();

    }
}