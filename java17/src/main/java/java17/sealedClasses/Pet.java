package java17.sealedClasses;

public abstract sealed class Pet permits Cat
{
    protected void walk() {
        System.out.println("Started walking...");
    }
}
