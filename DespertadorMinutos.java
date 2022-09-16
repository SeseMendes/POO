import java.util.*;

public class DespertadorMinutos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int h1, m1, h2 = 0, m2=0,fh,fm,sleep;
        System.out.println("type the current hour and minutes: ");
        h1 = entrada.nextInt();
        m1 = entrada.nextInt();
        if (h1 >= 0 && h1 <= 24 && m1 >= 0 && m1 <= 59) {
            System.out.println("hour and minutes that the alarm was set: ");
            h2 = entrada.nextInt();
            m2 = entrada.nextInt();
        }
        else{
            System.out.println("Invalid time!");
            System.exit(0);
        }
           
        fh= h2 - h1;
        //resulting hour time, if negative, the time has from one day to the next, h1>h2
        fm= m2 - m1;
        //resulting minutes time, if negative, m1>m2, then, the hour has not passed completely, you take one hour off the total
        if(fm<0){
            fh--;
            fm += 60;
        }
        if (fh < 0)
            fh = fh + 24;
        fh*=60;
        sleep = fh+fm;
        System.out.println("You have " + sleep + " minutes of sleep ");
        entrada.close();

    }
}