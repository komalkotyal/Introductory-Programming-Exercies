import java.lang.Math.*;
public class Diamond{

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        for (int i = 1-n ; i < n;i++)
        {
            for(int j=0 ;j<Math.abs(i);j++){
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * (n - Math.abs(i)) - 1; j++) {
                System.out.print("*");
            }
            for(int j=0 ;j<Math.abs(i);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}