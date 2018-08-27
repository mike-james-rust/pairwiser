package ApplicationUnderTest.Model

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class ParameterPairTest extends Specification {

    @Shared
    def parameter0 = new Parameter(new Integer(0), "string")
    @Shared
    def parameter1 = new Parameter(new Integer(1), "string")
    @Shared
    def parameter2 = new Parameter(new Integer(2), "string")
    @Shared
    def parameterPair01a = new ParameterPair(parameter0, parameter1)
    @Shared
    def parameterPair01b = new ParameterPair(parameter0, parameter1)
    @Shared
    def parameterPair02 = new ParameterPair(parameter0, parameter2)
    @Shared
    def parameterPair12 = new ParameterPair(parameter1, parameter2)

    @Unroll
    def "CompareTo"() {
        expect:
        a.compareTo(b) == c

        where:
        a                |b                | c
        parameterPair01a | parameterPair01b| 0
        parameterPair01a | parameterPair02 | -1
        parameterPair12  | parameterPair02 | 1
    }
}
