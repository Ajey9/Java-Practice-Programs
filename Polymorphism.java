package Java_programs;


class Animal
{
    public void move()
    {
        System.out.println("An animal is moving");
    }
}

class Lion extends Animal
{
    public void moveAnimal(Animal animal)
    {
        animal.move();
    }
}

class Tiger extends Lion
{
  public void moving(Lion lion)
  {
      lion.moveAnimal(lion);
  }
}
public class Polymorphism {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.moveAnimal(lion);

        Tiger tiger = new Tiger();
        tiger.moving(tiger);
    }
}
