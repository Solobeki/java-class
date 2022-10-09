public class Methods {
    public static void main(String[] args) {
        String name = "Sele";
        welcome(name);
        multiply(5, 10);
        multiply(5, 20);
        multiply(5, 30);
        divide(100, 10);
    }
    public static void welcome(String title){
        System.out.println(title);
    }
    public static void multiply(int a, int b){
        System.out.println(a*b);   
    }
    public static void divide(int a, int b){
        System.out.println(a/b); 
  }
}