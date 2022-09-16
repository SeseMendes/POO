import java.util.*;

public class VetorAleatMaior {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num,maior=-999999999;
        System.out.println("Write the size of array: ");
        num = entrada.nextInt();
        Random random = new Random();
        int[] vet = new int[num];

        for(int i=0;i<num;i++){
           vet[i] = random.nextInt(num);
           System.out.println(vet[i]);
        }

        for(int i=0;i<num;i++){
            if(vet[i]>maior){
                maior=vet[i];
                if(maior==vet[i]){
                    maior=vet[i];
                }
            }
        }
        System.out.println("greater number: " + maior);
        entrada.close();

    }
}
