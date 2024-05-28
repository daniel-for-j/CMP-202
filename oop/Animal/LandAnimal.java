public class LandAnimal extends Animal {
    
    @Override
    String move() {
        return "Swing on trees";
    }



    public static void main(String[] args){
        LandAnimal lion = new LandAnimal();
        LandAnimal monkey = new LandAnimal();
        System.out.println(monkey.move());
        
    
    }


}