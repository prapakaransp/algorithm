public class DutchFlagSolved
{

int a={1,1,2,0,1,0,2,0,1}

int r=0;
int w=1;

//Red color sorting
for(int i=1; i< a.length; i++)
{
 int j=i-1;
  while(j >= 0 && a[i] == r)
  {
    if(a[j] == 0)
    {
        swap(a[i],a[j])
    }else if( a[j] == r)
      {
        swap(a[j+1],a[i]);  
      }
        

    j--;
  }
 //white color sorting
  for(int i=1; i< a.length; i++)
  {
   int j=i-1;
    while(j >= 0 && a[i] == w)
    {
      if(a[j] == 0)
      {
          swap(a[i],a[j])
      }else if( a[j] == w)
        {
          swap(a[j+1],a[i]);  
        }
          
  
      j--;
    }



}






}