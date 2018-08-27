package ApplicationUnderTest.Model;

import javafx.util.Pair;
import lombok.Getter;
import lombok.Setter;

public class ValuePair {
    @Getter
    private Pair<Value, Value> pairOfValues;
    @Getter @Setter
    private boolean isCovered;

    public ValuePair(Pair<Value, Value> pairOfValues) {
        this.pairOfValues = pairOfValues;
        isCovered = false;
    }
    public ValuePair(Value value1, Value value2) {
        this.pairOfValues = new Pair<>(value1,value2);
        isCovered = false;
    }
}