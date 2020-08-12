package sorting;
import java.util.Arrays;

public class InsertionSort{
    
    public static void main(String str[])
    {
        int a[]= {100,50,30,200};
        sort(a);
         System.out.println(Arrays.toString(a));
    }

public static void sort(int a[])
{
    for(int i=0; i< a.length; i++)
    {
        
        for(int j=i; j > 0; j--)
        {
        
            if(a[j] > a[j-1])
            {
               int val=a[j-1];
               a[j-1]= a[j];
               a[j]= val;
                    
            }
        }
        
    }
    
    
    
}
    
    
}