
package area;


public class AREA {

    static int area(int l,int b){
       int ar=l*b;
       return ar;
    }
    static float area(float r){
       float ar= (float) (Math.PI*r*r);
       return ar;
    }

    public static void main(String[] args) {
        
        System.out.println(area(5));
       
    }
    
}
