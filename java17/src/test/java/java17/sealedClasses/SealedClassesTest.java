package java17.sealedClasses;

public class SealedClassesTest
{
    public static void main(String[] args)
    {
        final Pet pet = new Cat();
        final Car car = new Bora();

        pet.walk();
        car.start();
    }
}
