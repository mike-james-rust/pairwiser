package ApplicationUnderTest.Model;


import javafx.util.Pair;
import lombok.Getter;
import lombok.Setter;

public class ParameterPair{
    @Getter @Setter
    Pair<Parameter, Parameter> pairOfParameters;

    public ParameterPair(Parameter parameter1, Parameter parameter2)
    {
        this.pairOfParameters = new Pair<Parameter,Parameter>(parameter1,parameter2);
    }

    public ParameterPair(Pair<Parameter, Parameter> pairOfParameters) {
        this.pairOfParameters = pairOfParameters;
    }
}
