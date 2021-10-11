package java17.records;

/*
* Java 14 introduced record keyword and Java 15 improved it.
* Promotes:
* - Object immutability
* - Cannot be subclassed
*/
public record MyImmutableDTO(String name, int age) {}
