import java.util.*;
public class PrimeFactor{

    public static Set<Integer> generate(int n){
        Set<Integer> output = new HashSet<Integer>() ;
        while (n%2==0)
        {
            output.add(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            while (n%i == 0)
            {
                output.add(i);
                n /= i;
            }
        }
        if (n > 2)
            output.add(n);
        return output;
    }

    public static void main(String[] args){
        int n=30;
        System.out.println("N:"+n+" PrimeFactor:"+generate(n));
        n=1;
        System.out.println("N:"+n+" PrimeFactor:"+generate(n));
        n=315;
        System.out.println("N:"+n+" PrimeFactor:"+generate(n));
    }
}