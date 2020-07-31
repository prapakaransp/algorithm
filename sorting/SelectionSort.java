package sorting;

import java.util.Arrays;

public class SelectionSort{
    
    public static void main(String str[])
    {
        int a[]= {100,50,30,20};
        sort(a);
         System.out.println(Arrays.toString(a));
    }

public static void sort(int a[])
{
    for(int i=0; i< a.length; i++)
    {
        int min=i;
        for(int j=i+1; j < a.length; j++)
        {
            
            if(a[j] < a[min])
             min=j;
        }
        
         int val=a[i];
        a[i] = a[min];
        a[min]=val;
    }
    
    
    
}
    
    
}