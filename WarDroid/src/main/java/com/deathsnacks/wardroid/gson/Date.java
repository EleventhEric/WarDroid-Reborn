
package com.deathsnacks.wardroid.gson;


import com.google.gson.annotations.Expose;


public class Date {

    @Expose
    private int sec;
    @Expose
    private int usec;

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getUsec() {
        return usec;
    }

    public void setUsec(int usec) {
        this.usec = usec;
    }

}