package com.hz;

import java.util.*;

public class OrderBooleanAdapter implements BooleanAdapter {
    private ConsoleReader adaptee;

    private List<String> truthyValues;

    private String answer;

    public OrderBooleanAdapter(ConsoleReader reader) {
        this.adaptee = reader;

        String[] options = new String[] { "vegan pizza", "vegan", "vegeterian pizza", "vegeterian", "classic pizza",
                "classic", "whole wheat pizza", "whole wheat" };
        this.truthyValues = Arrays.asList(options);
    }

    @Override
    public Boolean readLine() {

        String line = this.adaptee.readLine();
        this.answer = line;

        // see if the given answer is in the list
        return truthyValues.contains(line);

    }

    public String getAnswerGiven() {
        return this.answer;
    }

}
