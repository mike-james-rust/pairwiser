package ApplicationUnderTest.Model;

public interface ParameterValuesArray {
    public Object getParameterValueByIndex(Integer integer);

    public Object getValueByCoordinates(Integer parameterIndex, Integer valueIndex);

    public Integer getNumberOfParameters();
}
