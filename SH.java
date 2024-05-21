public class JavaApplication26 {

 
    public static void main(String[] args) {
        int n=5;
       int a[]= {3,4,8,5,6};
       
      int highest= a[0];
          
  for(int i=0;i<a.length;i++){
        if( a[i]> highest)
             highest=a[i]; 
          
      } 
  int small= -1;
  for (int i=0;i<a.length;i++)
      
        if( a[i]>small && a[i]!=highest)
            small = a[i];
       System.out.println(small); 
       System.out.println(highest); 
       
    }
   
}
