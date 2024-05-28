public class AquaticAnimal extends Animal{
    @Override
    String move(){
        return "Swimming";

    }

    public static void main(String[] args){
        AquaticAnimal fish = new AquaticAnimal();
        System.out.println(fish.move());
    }
}