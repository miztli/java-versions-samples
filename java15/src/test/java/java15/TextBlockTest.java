package java15;

import org.junit.Test;

public class TextBlockTest
{
    @Test
    public void shouldTestUseOfTextBlock()
    {
        final String json = """
              {
                "animal" : "Quokka",
                "link" : "https://en.wikipedia.org/wiki/Quokka"
              }
            """;

        System.out.println(json);
    }
}
