package java13;

public class SwitchSamples
{
    public int dayOfWeek(final String day) {
        return switch(day) {
            case "monday" -> 1;
            default -> 0;
        };
    }
}
