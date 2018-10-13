
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            k = (n-k);
            int[] a = new int[n];
            int compare=0;
            int qualified = 0;
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            compare = a[k];
            //System.out.println("compare is "+compare);
            
            for(int i=0;i<n;i++)
            {
                if(a[i]>=compare){
                    //System.out.println("ai is "+a[i]);
                    qualified+=1;}
            }
            System.out.println(qualified);
            
            test-=1;
        }
    }
    
}
