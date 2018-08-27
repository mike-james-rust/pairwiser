package ApplicationUnderTest.Model;


import javafx.util.Pair;
import lombok.Getter;
import lombok.Setter;

public class ParameterPair implements Comparable<ParameterPair>{
    @Getter @Setter
    Pair<Parameter, Parameter> pairOfParameters;

    public ParameterPair(Parameter parameter1, Parameter parameter2)
    {
        this.pairOfParameters = new Pair<Parameter,Parameter>(parameter1,parameter2);
    }

    @Override
    public int compareTo(ParameterPair otherPair) {
        int firstParameterComparable = pairOfParameters.getKey().compareTo(otherPair.getPairOfParameters().getKey());
        if (firstParameterComparable == 0){
            return pairOfParameters.getValue().compareTo(otherPair.getPairOfParameters().getValue());
        }
        return firstParameterComparable;
    }
}
