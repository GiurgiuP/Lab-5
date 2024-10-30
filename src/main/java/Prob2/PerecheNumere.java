package Prob2;

public class PerecheNumere
{
    private int numar1;
    private int numar2;

    public int getNumar1()
    {
        return numar1;
    }

    public int getNumar2()
    {
        return numar2;
    }
    public PerecheNumere() {}
    public PerecheNumere(int a, int b)
    {
        super();
        this.numar1 = a;
        this.numar2 = b;
    }

    private boolean Fibo(int n)
    {
        int a=0,b=1,c=0;
        while (c<n)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return c==n;
    }

    public boolean esteFibo()
    {
        return Fibo(numar1)&&Fibo(numar2);
    }

    public int cmmmc()
    {
        int min=Math.min(numar1, numar2);
        int max=Math.max(numar1, numar2);
        int i=max;
        while (i%min!=0)
        {
            i += max;
        }
        return i;
    }

    private int suma(int n)
    {
        int sum=0;
        while (n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }


    public boolean sumacif()
    {
        return suma(numar1)==suma(numar2);
    }



    public boolean cifreEgale()
    {
        int numar1= numarCifrePare(this.numar1);
        int numar2= numarCifrePare(this.numar2);

        return numar1==numar2;
    }

    public int numarCifrePare(int n)
    {
        int i=0;
        while (n>0)
        {
            if((n%10)%2==0)
            {
                i++;
            }
            n/=10;
        }
        return i;
    }




    @Override
    public String toString()
    {
        return numar1 + " , " + numar2 + " , " +"Apartie de Fibonaci: " + esteFibo()+" , " + "CMMC: " + cmmmc() + " , "+ "Suma cifre egale: " + sumacif() + " , " + "Au acelasi numar cifre pare:"+ (cifreEgale() ? "DA" : "NU")  ;
    }



}
