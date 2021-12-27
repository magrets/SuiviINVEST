import java.io.*;

public class FileSav {
    private ObjectInputStream oFR;
    private ObjectOutputStream oFW;
    private final String nomFichier = "Sauvegarde.dat";

    public FileSav(){

    }

    public void sauvegarde(Plateforme tmp){
        ouvrir('W');
        try{
            if(tmp != null){
                oFW.writeObject(tmp);
            }
            fermer('W');
        }catch (IOException e){
            System.out.println("Erreur lors de la sauvegarde...");
        }
    }

    public Plateforme lit(){
        Plateforme tmp = null;
        if(ouvrir('R')) {
            try {
                tmp = (Plateforme) oFR.readObject();
            } catch (ClassNotFoundException e) {
                System.out.println("Erreur lors de la lecture du fichier");
            } catch (IOException e) {
                System.out.println("Erreur lors de la lecture du fichier IOexeption");
            }
            fermer('R');
        }
        return tmp;
    }

    private boolean ouvrir(char mode){
        mode = Character.toUpperCase(mode);
        try {
            if (mode == 'R' || mode == 'L') {
                oFR = new ObjectInputStream(new FileInputStream(nomFichier));
            } else if (mode == 'W' || mode == 'E') {
                oFW = new ObjectOutputStream(new FileOutputStream(nomFichier));
            }
            return true;
        }catch (IOException e){
            System.out.println("Impossible d'ouvrir le fichier...");
            return false;
        }
    }

    private void fermer(char mode){
        try{
        if (mode == 'R' || mode == 'L') {
            oFR.close();
        }else if (mode == 'W' || mode == 'E'){
            oFW.close();
        }
        }catch (IOException e){
            System.out.println("Probleme lors da fermeture du fichier...");
        }
    }
}
