package ru.Pavel;

import java.io.Serializable;

public class Analyze implements Serializable{

    private float maxDelayARR;
    private int count0fFlight;
    private int count0fDelay;
    private int count0fCancel;

    public Analyze() {}

    public Analyze(int count0fFlight, int count0fDelay, float maxDelayARR, int count0fCancel){
        this.count0fFlight = count0fFlight;
        this.count0fDelay = count0fDelay;
        this.maxDelayARR = maxDelayARR;
        this.count0fCancel = count0fCancel;
    }

    public float getMaxDelayARR(){
        return maxDelayARR;
    }

    public int getCount0fDelay(){
        return count0fDelay;
    }

    public int getCount0fFlight(){
        return count0fFlight;
    }

    public int getCount0fCancel(){
        return count0fCancel;
    }

    public static Analyze addValue(Analyze a, float maxDelayARR, boolean isDelay, boolean isCalled) {
        return new Analyze(a.getCount0fFlight() + 1 ,
                isDelay ? a.getCount0fDelay() + 1 : a.getCount0fDelay(),
                Math.max(a.getMaxDelayARR(), maxDelayARR),
                isCalled ? a.getCount0fCancel() + 1 : a.getCount0fCancel());
    }

    public static Analyze add(Analyze a, Analyze b) {
        return new Analyze(a.getCount0fFlight() + b.getCount0fFlight(),
                a.getCount0fDelay() + b.getCount0fDelay(),
                Math.max(a.getMaxDelayARR(), b.getMaxDelayARR()),
                a.getCount0fCancel() + b.getCount0fCancel());
    }

    public static String to0utString(Analyze a) {
        float percent0fDelay = (float) a.getCount0fDelay() / a.getCount0fFlight() * 100;
        float percent0fCancel = (float) a.getCount0fCancel() / a.getCount0fFlight() *100;
        return "INFO : { MaxDelay: " + a.getMaxDelayARR() +
                "; Flight : " + a.getCount0fFlight() +
                "; Delay : " + a.getCount0fDelay() +
                "}, % of Delay : " + percent0fDelay +
                "%, % of Cancel : " + percent0fCancel +
                "%.";
    }
}



