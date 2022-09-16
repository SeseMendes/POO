import java.util.*;

public class AcessoSenha { 
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String password;
        System.out.println("Password: ");
        password = entrada.nextLine();

        if(password.compareTo("a76dk09")==0)
            System.out.println("Permitted access");
        else{
            do{
                System.out.println("Wrong password, try again\n Password: ");
                password = entrada.nextLine();
            }while(password.compareTo("a76dk09")!=0);
            System.out.println("Permitted access");
        }
        entrada.close();

    }
}
