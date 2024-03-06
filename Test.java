public class Test {
    public static void main(String args[]) {
      Animal test = new Animal();
      test.walk();
      
      Frog quaxi = new Frog();
      quaxi.walk();
      quaxi.makeNoise();
      
      Animal aquaxiAsAnimal = (Animal) quaxi;
      aquaxiAsAnimal.walk();
      aquaxiAsAnimal.makeNoise();
    }
}

class Animal{
    private int color;
    private int countEyes;
    private String name;
    
    public void walk(){ System.out.println("Standard Walk"); }
    public void makeNoise(){System.out.println("Standard Noise");}
}

class Frog extends Animal{
    public void walk(){ System.out.println("quak"); }
    public void makeNoise(){System.out.println("jump");}
}
class Cat extends Animal{
    public void walk(){ System.out.println("walk"); }
    public void makeNoise(){System.out.println("miau");}
}
class Dog extends Animal{
    public void walk(){ System.out.println("walk"); }
    public void makeNoise(){System.out.println("wuff");}
}
class Bird extends Animal{
    public void walk(){ System.out.println("fly"); }
    public void makeNoise(){System.out.println("sings");}
}