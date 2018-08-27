package ApplicationUnderTest.Model

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class ParameterTest extends Specification {

    @Shared
    def parameter0a = new Parameter(new Integer(0), "string0a")
    @Shared
    def parameter0b = new Parameter(new Integer(0), "string0b")
    @Shared
    def parameter1 = new Parameter(new Integer(1), "string1")

    @Unroll
    def "CompareTo"() {
        expect:
        a.compareTo(b) == c

        where:
        a           |b            | c
        parameter0a | parameter0b | 0
        parameter0a | parameter1  | -1
        parameter1  | parameter0a | 1
    }
}
