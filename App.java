import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Digite quantas contas deseja cadastrar: ");
        n = entrada.nextInt();
        ContaLuz[] vet = new ContaLuz[n];
        for (int i=0;i<n;i++){
            vet[i]= new ContaLuz();
        }
        for(int i=0;i<n;i++){
            System.out.printf("Informacoes conta %2d: \n", (i+1));
            System.out.println("Codigo: ");
            vet[i].codigo= entrada.nextInt();
            System.out.println("Data em que a leitura foi realizada: ");
            vet[i].dia1= entrada.nextInt();
            vet[i].mes1= entrada.nextInt();
            vet[i].ano1= entrada.nextInt();
            if(vet[i].dia1>31||vet[i].mes1>12||vet[i].ano1<1900){
                System.out.println("Formato de data inválido!");
                System.exit(0);
            }
            System.out.println("Quantidade de KW gasto no mes: ");
            vet[i].kw= entrada.nextInt();
            System.out.println("Valor pago: ");
            vet[i].valor= entrada.nextFloat();
            System.out.println("Data do vencimento: ");
            vet[i].dia2= entrada.nextInt();
            vet[i].mes2= entrada.nextInt();
            vet[i].ano2= entrada.nextInt();
            if(vet[i].dia2>31||vet[i].mes2>12||vet[i].ano2<1900){
                System.out.println("Formato de data inválido!");
                System.exit(0);
            }
            System.out.println("Foi pago(sim ou nao): ");
            vet[i].pago= entrada.next();
            if(vet[i].pago.equals("sim") || vet[i].pago.equals("nao")){
                if(vet[i].pago.equals("sim")){
                    System.out.println("Data do pagamento: ");
                    vet[i].dia3= entrada.nextInt();
                    vet[i].mes3= entrada.nextInt();
                    vet[i].ano3= entrada.nextInt();
                    if(vet[i].dia3>31||vet[i].mes3>12||vet[i].ano3<1900){
                        System.out.println("Formato de data inválido!");
                        System.exit(0);
                    }
                }
            } else{
                System.out.println("Resposta invalida!");
                System.exit(0);
            }
        }
        for(int i=0;i<n;i++){
            System.out.printf("Informacoes conta %2d: \n", (i+1));
            System.out.println("Codigo: " + vet[i].codigo + "\nData de leitura: " + vet[i].dia1 + "/" + vet[i].mes1 + "/" + vet[i].ano1 + "\nKW: " + vet[i].kw + "\nValor: " + vet[i].valor + "\nData vencimento: " + vet[i].dia2 + "/"+vet[i].mes2 + "/" + vet[i].ano2 + "\nPaga: "+vet[i].pago);
            if(vet[i].pago.equals("sim")){
                System.out.println("\nData pagamento: " +vet[i].dia3+"/"+vet[i].mes3+"/"+vet[i].ano3);
            }
        }
        int maior=-999999999,mes=0,menor=9999999,mesm=0,media=0,soma=0;
        for(int i=0;i<n;i++){
            if(vet[i].kw>maior){
                maior=vet[i].kw;
                mes=vet[i].mes1;
            }
            if(vet[i].kw<menor){
                menor=vet[i].kw;
                mesm=vet[i].mes1;
            }
            soma+=vet[i].kw;
            media=soma/n;
            if(vet[i].pago.compareTo("sim")==0){
                if(vet[i].ano2<vet[i].ano3 || vet[i].mes3>vet[i].mes2)
                    System.out.println("Conta " + vet[i].codigo + " paga em atraso.");
                else if (vet[i].mes2==vet[i].mes3 && vet[i].dia3>vet[i].dia2)
                    System.out.println("Conta " + vet[i].codigo + " paga em atraso.");
                else
                    System.out.println("Conta " + vet[i].codigo + " paga antes ou no dia do vencimento.");
            }
            else {
                System.out.println("Conta " + vet[i].codigo + " ainda não paga.");
            }
        }
        System.out.println("Mes de maior consumo: "+ mes +"-"+ maior);
        System.out.println("Mes de menor consumo: "+ mesm +"-"+ menor);
        System.out.println("Media de consumo: "+ media);
    }
}
