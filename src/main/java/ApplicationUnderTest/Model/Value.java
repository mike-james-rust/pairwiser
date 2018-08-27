package ApplicationUnderTest.Model;

import lombok.Getter;

public class Value {
    @Getter
    private Object object;
    @Getter
    private Parameter parameter;

    public Value(Object object, Parameter parameter) {
        this.object = object;
        this.parameter = parameter;
    }
}
