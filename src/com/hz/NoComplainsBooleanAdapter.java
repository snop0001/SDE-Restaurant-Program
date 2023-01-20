package com.hz;

import java.util.*;

public class NoComplainsBooleanAdapter implements BooleanAdapter {
    private ConsoleReader adaptee;

    private List<String> truthyValues;

    public NoComplainsBooleanAdapter(ConsoleReader reader) {
        this.adaptee = reader;

        String[] positiveWords = new String[] { "no", "no thank you", "its great", "we have a great time",
                "I love it here", "no this was the best meal ever", "nee", "nee bedankt", "alles is prima" };
        this.truthyValues = Arrays.asList(positiveWords);
    }

    @Override
    public Boolean readLine() {

        String line = this.adaptee.readLine();

        // see if the given answer is in the list
        return truthyValues.contains(line);

    }
}
