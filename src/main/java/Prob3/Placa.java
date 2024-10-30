package Prob3;


import java.util.Arrays;

public class Placa
{
    private String descriere;
    private int lungime;
    private int latime;
    private int nr_bucati;
    private Orientare orientare;
    private boolean[]canturi;


    public enum Orientare
    {
        LUNGIME,LATIME,ORICARE
    }
    public Placa(){}
    public Placa(String descriere, int lungime, int latime, int nr_bucati, Orientare orientare,boolean[]canturi)
    {
        this.descriere = descriere;
        this.lungime = lungime;
        this.latime = latime;
        this.nr_bucati = nr_bucati;
        this.orientare = orientare;
        this.canturi = canturi;
    }

    public String getDescriere()
    {
        return descriere;
    }

    public void setDescriere(String descriere)
    {
        this.descriere = descriere;
    }

    public int getLungime()
    {
        return lungime;
    }

    public void setLungime(int lungime)
    {
        this.lungime = lungime;
    }

    public int getLatime()
    {
        return latime;
    }

    public void setLatime(int latime)
    {
        this.latime = latime;
    }

    public Orientare getOrientare()
    {
        return orientare;
    }

    public void setOrientare(Orientare orientare)
    {
        this.orientare = orientare;
    }

    public boolean[] getCanturi()
    {
        return canturi;
    }

    public void setCanturi(boolean[] canturi)
    {
        this.canturi = canturi;
    }

    public int getnr_bucati()
    {
        return nr_bucati;
    }

    public void setnr_bucati(int nrBucati)
    {
        this.nr_bucati = nrBucati;
    }

    @Override
    public String toString()
    {
        return "Placa {" +
                "\n  Descriere: " + descriere +
                ",\n  Lungime: " + lungime +
                ",\n  Latime: " + latime +
                ",\n  Orientare: " + orientare +
                ",\n  Canturi: " + Arrays.toString(canturi) +
                ",\n  Numar bucati: " + nr_bucati +
                "\n}";
    }




}
