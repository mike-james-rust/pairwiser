package ApplicationUnderTest.Model;

import javafx.util.Pair;
import lombok.Getter;

import java.util.ArrayList;

public class ParameterPairValuePairArray {
    @Getter
    private ArrayList<Pair<ParameterPair,ArrayList<ValuePair>>> parameterPairToValuePairArray;

    public ParameterPairValuePairArray(ArrayList<Pair<ParameterPair, ArrayList<ValuePair>>> parameterToValuesPairArray) {
        this.parameterPairToValuePairArray = parameterToValuesPairArray;
    }

    public ParameterPair getParameterPairByIndex(Integer integer){
        return parameterPairToValuePairArray.get(integer).getKey();
    }

    public ValuePair getValuePairByCoordinates(Integer parameterPairIndex, Integer valuePairIndex){
        return parameterPairToValuePairArray.get(parameterPairIndex).getValue().get(valuePairIndex);
    }

    public Integer getNumberOfParametersPairs(){
        return parameterPairToValuePairArray.size();
    }

    public Integer getNumberOfValuesPairsFromParameterPairIndex(Integer parameterIndex){
        return parameterPairToValuePairArray.get(parameterIndex).getValue().size();
    }



}
