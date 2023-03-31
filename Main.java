// programma che effettua la moltoplicazione e la divisione attraverso somma e sottrazione
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b;
        int n,d,r;
        int somma=0;
        int q=0;
        //fa la moltiplicazione con la somma
        System.out.println("Inserisci valori per effettuare la moltiplicazione:");
        do{
            System.out.println("Inserisci il valore a:");
            a = input.nextInt();
            System.out.println("Inserisci il valore b:");
            b = input.nextInt();
        }while(a<=0 || b<=0);

        for(int i=0; i<b; i++){
            somma+=a;
        }
        System.out.println("La moltiplicazione tra i due valori è di: "+somma);
        System.out.println("\n\n");

        //fa la divisione con la sottrazione
        do{
            System.out.println("Inserisci valori per effettuare la divisione:");
            System.out.println("Inserisci il numeratore a:");
            n = input.nextInt();
            System.out.println("Inserisci il denominatore b:");
            d = input.nextInt();
        }while(n<0 || d<0);

        while(n>=d){
            n-=d;
            q++;
        }
        r=n;
        System.out.println("Il quoziente della tua divisione è: "+q);
        System.out.println("Il resto della tua divisione è: "+r);
    }
}