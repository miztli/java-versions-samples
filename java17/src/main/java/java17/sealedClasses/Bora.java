package java17.sealedClasses;

public final class Bora implements Car
{
    @Override
    public void start()
    {
        System.out.printf("Starting engine....");
    }
}
