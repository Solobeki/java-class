public class Main {
    public static void main(String[] args) {
        Abstract myAbc = new Abstract();
        myAbc.animalSound();
        myAbc.sleep();
        
        System.out.println("This is my brother birthday:" + myAbc.year);
    }
}
