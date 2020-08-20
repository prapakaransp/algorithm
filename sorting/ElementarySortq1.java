/*Given two arrays \mathtt{a[]}a[] and \mathtt{b[]}b[], 
each containing nn distinct 2D points in the plane, 
design a subquadratic algorithm to count the number of 
points that are contained both in array \mathtt{a[]}a[] 
and array \mathtt{b[]}b[].*/


public class ElementarySortq1
{

class Point2d implements Comparable<Point2d>
{
    private int x;
    private int y;

    Point2d(int x, int y)
    {
       this.x=x;
       this.y=y;
    }

  piblic int compareTo(Point2d val)
  {
      if(this.x > val.x) return 1;
      else if (this.x < val.x) return -1;
      else if (this.y > val.y) return 1;
      else if (this.y < val.y) return -1;
      else
       return 0;
  }
}

public void countElement(Point2d a[], Point2d b)
{
  Shell.sort(a);
  Shell.sort(b);
  int i=0;
  int j=0;
  int counter=0;
  while(i < a.length && j < b.length)
  {
     if (a[i].compareTo(b[j])) < 1
       {
         i++;
         j++;
         counter++;
       }
       else if(a[i].compareTo(b[j])) > 1
       {
         i++;
         j++;
         counter++;
       }
       else
          {
              i++;
              j++;
          }
    }
 
    if(i < a.length)
    {
      count += a.length -i; 

    } else if(j < b.length)
    {
        count += b.length - j;
    }
}
}
}
}