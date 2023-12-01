package PlayerMultimediale;
import java.util.Scanner;

public class PlayerScanner {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            PlayerMultimediale[] multimedia = new PlayerMultimediale[5];

                System.out.println("Inserisci il titolo: ");
                String titolo = input.nextLine();

                System.out.println("Inserisci la durata in secondi: ");
                int durata = input.nextInt();

                System.out.println("Inserisci il volume: ");
                int volume= input.nextInt();

                System.out.println("Inserisci la luminosita: ");
                int luminosita = input.nextInt();

                System.out.println("il titolo è " +" " + titolo + " " + "di durata" + " " + durata + " " + "volume" + " " + " " + "luminosità" + " " + luminosita);


            input.close();
        }

}
