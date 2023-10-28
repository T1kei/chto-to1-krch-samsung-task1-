import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner in = new Scanner(System.in);
        /*
        int a = in.nextInt(), b = in.nextInt();
        System.out.println(Math.pow(a,2)+Math.pow(b,2));
        &  и
        ~ not
        | или
        ^ исключ или
        (к=101) << 2 =  10100 сдвиг(* на 2 в степени сдвига)
         */
        /*int a = in.nextInt();
        if (a/10 == 0 && a>0)
            System.out.println("DIGIT");
        else if (a > 0 && a/100 == 0)
            System.out.println("NUM");
        else
            System.out.println("OTHER");*/
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            int a = in.nextInt();
            arr[i] = a;
        }
        for(int i = 0; i<(n/2); i++){
            int dop = arr[n-i];
            arr[n-i] = arr[i];
            arr[i]=dop;
        }
        for (int i =0;i<n; i++)
            System.out.println(arr[i]);
    }
}