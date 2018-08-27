package ApplicationUnderTest.Model;

import javafx.util.Pair;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

public class ParameterValuesArray {
    @Getter
    private ArrayList< Pair<String,ArrayList<String>> > parameterToValuesPairArray;

    public ParameterValuesArray(ArrayList<Pair<String, ArrayList<String>>> parameterToValuesPairArray) {
        this.parameterToValuesPairArray = parameterToValuesPairArray;
    }

    public String getParameterValueByIndex(Integer integer){
        return parameterToValuesPairArray.get(integer).getKey();
    }

    public String getValueByCoordinates(Integer parameterIndex, Integer valueIndex){
        return parameterToValuesPairArray.get(parameterIndex).getValue().get(valueIndex);
    }

    public Integer getNumberOfParameters(){
        return parameterToValuesPairArray.size();
    }

    public Integer getNumberOfValuesFromParameterIndex(Integer parameterIndex){
        return parameterToValuesPairArray.get(parameterIndex).getValue().size();
    }
}
