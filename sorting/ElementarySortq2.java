Question 2
/*Permutation. Given two integer arrays of size nn, 
design a subquadratic algorithm to determine whether one is a 
permutation of the other. That is, do they contain exactly the 
same entries but, possibly, in a different order.*/

public class ElementarySortq2
{

int a= {1,2,3,4,5};
int b= {2,1,3,5,4};

public boolean findPerumtation()
{
   if(a.length == b.length)
   {
       Shell.sort(a);
       Shell.sort(b);
    
      for(int i=0; i< a.length; i++)
      {
       if(a[i] != b[i])
       {
        return false; 
       }
      
      } 

}
   else return false;


}




}