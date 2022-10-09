public class Men {
    private String name;

     public Men(String y){
        this.name=y;
     }

     public void setName(String name) {
        this.name= name;
    }
    
    public String getName() {
       return this.name;
    }

    void eatFood( String name) {
        System.out.println("I like to eat pizza and"+ " "+ name);
    }
}
