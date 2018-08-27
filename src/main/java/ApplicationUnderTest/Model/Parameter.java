package ApplicationUnderTest.Model;

import lombok.Getter;

public class Parameter implements Comparable<Parameter>{
    @Getter
    private Integer index;
    @Getter
    private String name;

    public Parameter(Integer index, String name) {
        this.index = index;
        this.name = name;
    }

    @Override
    public int compareTo(Parameter otherParameter) {
        return index.compareTo(otherParameter.getIndex());
    }
}
