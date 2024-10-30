package Prob3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class MainP3
{
    public static List<Mobilier> citire()
    {
        try
        {
            File file=new File("src/main/resources/mobilier.json");
            ObjectMapper mapper=new ObjectMapper();
            List<Mobilier> mobilier = mapper.readValue(file, new TypeReference<List<Mobilier>>(){});
            return mobilier;
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void afisareMobila(List<Mobilier> mobilia)
    {
        for(Mobilier mobilier : mobilia)
        {
            System.out.println("Mobilier: "+mobilier.getNume());
            System.out.println("Placi: ");
            for(Placa placa:mobilier.getPlaci())
            {
                System.out.println(" - "+placa.toString());
            }
            System.out.println();
        }
    }
    public static void afisarePlaci(List<Mobilier> mobila,String numeMobila)
    {
        for(Mobilier mobilier : mobila)
        {
            for(Placa placa:mobilier.getPlaci())
            {
                System.out.println(placa.toString());
            }
        }
    }

    public static void numarColi(List<Mobilier> mobila, String numeMobilier)
    {
        int lungimeCoala = 2800;
        int latimeCoala = 2070;
        int ariaCoala = lungimeCoala * latimeCoala;

        for (Mobilier mobilier : mobila)
        {
                int ariaTotala = 0;
                for (Placa placa : mobilier.getPlaci())
                {
                    int ariaPlaca = placa.getLungime() * placa.getLatime();
                    ariaTotala += ariaPlaca * placa.getnr_bucati();
                }
                int numarColi = (int) Math.ceil((double) ariaTotala / ariaCoala);
                System.out.println("Pentru mobilierul \"" + mobilier.getNume() + "\", sunt necesare " + numarColi + " coli de PAL.");
        }

    }



    public static void main(String[] args)
    {   int opt;
        Scanner scanner1 = new Scanner(System.in);
        List<Mobilier> mobile =citire();
        do {

            System.out.println("\nMeniu:");
            System.out.println("1. Citeste datele din mobilier.json");
            System.out.println("2. Afiseaza piesele de mobilier");
            System.out.println("3. Afiseaza placile care compun o piesa de mobilier");
            System.out.println("4. Afiseaza numarul de coli necesar pentru o piesa de mobilier");
            System.out.println("0. Iesire");
            System.out.print("Alege o optiune: ");
            opt = scanner1.nextInt();
            switch (opt)
            {
                case 1:
                        for(Mobilier m: mobile)
                        {
                            System.out.println(mobile);
                        }
                        ;break;
                case 2:afisareMobila(mobile);break;
                case 3:System.out.println("Dati numele mobilierului: ");
                String numeMobila = scanner1.next();
                afisarePlaci(mobile,numeMobila);
                    break;
                case 4:
                    System.out.println("Dati numele mobilierului: ");
                    String calcul= scanner1.next();
                    numarColi(mobile,calcul);
                    break;
                case 0:exit(0);break;
            }
        }
        while (opt!=0);
        scanner1.close();
    }

}
