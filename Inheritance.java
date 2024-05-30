
package inheritance;


  class Abhishek{
      public double radius;
      
      public double area(){
          return Math.PI*radius*radius;
      }
      public double perimeter(){
          return 2*Math.PI*radius;
      }
      public double surcumference(){
          return perimeter();
      }
  }
    class Rathore extends Abhishek{
        public double hight;
        
        public double volume(){
            return area()*radius;
        }
    }


public class Inheritance {

   
    public static void main(String[] args) {
        
    Rathore c= new Rathore();
         
    c.hight=4;
    c.radius=1;
    System.out.println( c.volume());
      System.out.println( c.area());
        System.out.println( c.getClass());
            
     
    }
    
}
