package java13

import spock.lang.Specification
import org.junit.Test

class SwitchSamplesSpec extends Specification
{
    def switchSamples = new SwitchSamples()

    @Test
    def 'should get day of week'()
    {
        when:
        def monday =switchSamples.dayOfWeek("monday")

        then:
        monday == 1
    }
}
