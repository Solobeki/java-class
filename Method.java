public class Method {
    
    public static void main(String[] args) {
        
        myMethod(5);
        myMethod(-5);
        myMethod(0);
    }
   
   public static void myMethod(int number) {
    if(number > 0) {
    System.out.println("positive");
    } else if (number < 0){
    System.out.println("negative"); 
    } else if (number == 0) {
        System.out.println("Zero");
        System.out.println("Zero");
    }
   }
}