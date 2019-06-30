package com.example03.util;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class DateSequenceGenerator implements BaseSequenceGenerator {


    private int initial;
    private String format="yyyy-MM-dd";
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
    private final AtomicInteger counter = new AtomicInteger();

    public DateSequenceGenerator(){

        System.out.println("2-2) DateSequenceGenerator created : "+this.toString());
    }


    public void setFormat(String format){
        this.format = format;
        this.simpleDateFormat = new SimpleDateFormat(format);
    }

    public void setInitial(int initial){
        this.initial = initial;
    }

    @Override
    public String getSequence() {
        Date date = new Date();
        StringBuilder builder = new StringBuilder();
        builder.append(simpleDateFormat.format(date)).append("_").append(initial+counter.getAndIncrement());
        return builder.toString();
    }
}
