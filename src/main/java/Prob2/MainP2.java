package Prob2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainP2
{
    public static void scriere(List<PerecheNumere> lista) {
        try
        {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/numere.json");
            mapper.writeValue(file,lista);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static List<PerecheNumere> citire()
    {
        try
        {
            File file=new File("src/main/resources/numere.json");
            ObjectMapper mapper=new ObjectMapper();
            List<PerecheNumere> numer = mapper.readValue(file, new TypeReference<List<PerecheNumere>>(){});
            return numer;
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List<PerecheNumere> perechi =citire();
        System.out.println(perechi);
        for(PerecheNumere p: perechi)
        {
            System.out.println(p);
        }
        Scanner scanner1=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);

        System.out.println("Primul numar:");
       int nr1 = scanner1.nextInt();

       System.out.println("Al doilea numar:");
       int nr2 = scanner2.nextInt();

        perechi.add(new PerecheNumere(nr1,nr2));
        scriere(perechi);
        scanner1.close();
        scanner2.close();
    }
}
