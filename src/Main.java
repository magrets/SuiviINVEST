import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Plateforme platforme;
        FileSav fileSav = new FileSav();

        byte choix = 0;

        platforme = fileSav.lit();
        if (platforme == null){
            platforme = new Plateforme("Mintos");
        }

        do {
            System.out.println("Que voulez vous faire :");
            System.out.println("1. Ajouter une platforme");
            System.out.println("2. Ajouter un mois");
            System.out.println("3. Affiche plateforme");
            System.out.println("4. sortir");
            choix = Sc.nextByte();
            switch (choix) {
                case 1:
                    break;
                case 2:
                    platforme.ajouteMois();
                    break;
                case 3:
                    platforme.affichePlateforme();
                    break;
                case 4:
                    sortir(fileSav, platforme);
                    break;
            }
        }while(4 != choix);
    }

    private static void sortir(FileSav f, Plateforme p){
        f.sauvegarde(p);
        Sc.close();
        System.exit(0);
    }
}
