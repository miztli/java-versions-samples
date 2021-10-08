package example;

/**
 * Please, add junit once gradle supports jdk 17
 */
class MyImmutableDTOTest
{
    public static void main(String[] args)
    {
        shouldCreateAnImmutableObjectUsingRecordKeyword();
    }

    public static void shouldCreateAnImmutableObjectUsingRecordKeyword() {
        MyImmutableDTO myImmutableDTO = new MyImmutableDTO("Miztli", 31);

        //myImmutableDTO.set <-- not available
        System.out.println("My name is: " + myImmutableDTO.name());
        System.out.println("My age is: " + myImmutableDTO.age());
    }

}
