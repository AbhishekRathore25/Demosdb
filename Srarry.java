
package srarry;


public class Srarry {

    
    public static void main(String[] args) {
        
         int[] a={34,67,56,24,12,98,56,345,76};
         for (int  x:a)
             System.out.print(x+ " ");
         
             System.out.println(" ");
         int temp=a[0];
        
        for(int i=1;i<a.length;i++)
        {
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
        
        for(int x:a)
            System.out.print(x+",");
        System.out.println("");

    }   
}