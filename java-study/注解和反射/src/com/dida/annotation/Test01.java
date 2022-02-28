package com.dida.annotation;


@Deprecated
@SuppressWarnings("all")
public class Test01 {


    @Myannotation
    public void test(){
    }


    @Override
    public String toString() {
        return "Test01{}";
    }

    @interface Myannotation{
        String value()default "0";
    }



}
