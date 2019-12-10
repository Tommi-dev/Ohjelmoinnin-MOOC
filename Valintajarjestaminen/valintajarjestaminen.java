
import java.util.Arrays;


public class valintajarjestaminen {

    public static void main(String[] args) {
        // Tee testikoodia tänne

          
        System.out.println("");
        int[] luvut = {8, 3, 7, 9, 1, 2, 4}; 
        for (int i = 0; i < luvut.length; i++) { 
            System.out.print(luvut[i]);
        } 
        System.out.println(" "); 
         
        // Järjestetään luvut
        valintajarjestaminen.jarjesta(luvut); 
        for (int i = 0; i < luvut.length; i++) { 
            System.out.print(luvut[i]);
        } 
        System.out.println(" "); 

    } 
    
    /** Metodi palauttaa metodille parametrina annetun kokonaislukutaulukon 
     pienimmän luvun.*/ 
    public static int pienin(int[] taulukko) { 
         
        int i = 1; 
        int pienin = taulukko[0];
        while (i < taulukko.length) { 
            if (taulukko[i] < pienin) { 
                pienin = taulukko[i];
            } 
            i++;
        } 
         
        return pienin;
    } 
     
    /** Metodi palauttaa sille parametrina annetun taulukon pienimmän 
     luvun indeksin.*/
    public static int pienimmanIndeksi(int[] taulukko) { 
         
        int i = 0; 
        int pieninIndeksi = taulukko[0];
        while(i < taulukko.length) { 
            if (taulukko[i] == pienin(taulukko)) { 
               pieninIndeksi = i; 
            } 
            i++;
        } 
        return pieninIndeksi;
    } 
     
    /** Metodille annetaan parametrina taulukon lisäksi aloitusindeksi, josta 
     lähtien pienintä lukua etsitään.*/
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) { 
         
        int i = 0; 
        int pienin = taulukko[aloitusIndeksi];
        int pieninIndeksi = aloitusIndeksi; 
        while (i < taulukko.length) { 
            
            if (i >= aloitusIndeksi) { 
                if (taulukko[i] < pienin) { 
                    pienin = taulukko[i];
                    pieninIndeksi = i;
                }
            }

            i++;
        } 
         
        return pieninIndeksi;
    } 
     
    /** Metodi vaihtaa indekseissä olevat luvut keskenään.*/
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) { 
        int muisti = taulukko[indeksi1]; 
        taulukko[indeksi1] = taulukko[indeksi2]; 
        taulukko[indeksi2] = muisti;
    } 
     
    /** Toteutetaan järjestämisalgoritmi nimeltä valintajärjestäminen.*/
    public static void jarjesta(int[] taulukko) { 

        int i = 0; 
        while(i < taulukko.length) {  
            //System.out.println(Arrays.toString(taulukko)); 
            vaihda(taulukko, i, pienimmanIndeksiAlkaen(taulukko, i));
            i++;
        }
    }
}
