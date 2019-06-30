package com.example03.util;
import org.springframework.stereotype.Component;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class SequenceGenerator implements BaseSequenceGenerator {
    private String prefix;
    private String suffix;
    private int initial;
    private final AtomicInteger counter = new AtomicInteger();

    public SequenceGenerator(){

        System.out.println("2-1) Bean_SequenceGenerator created : "+this.toString());
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public String getSequence() {
        StringBuilder builder = new StringBuilder();
        builder.append(prefix)
                .append(initial+counter.getAndIncrement())
                .append(suffix);
        return builder.toString();
    }
}
