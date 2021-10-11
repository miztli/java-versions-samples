package java17.sealedClasses;

public sealed interface Car permits Bora
{
    void start();
}
