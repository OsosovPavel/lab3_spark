package ru.Pavel;

import java.io.Serializable;


public class Serialization implements Serializable {
    private int destAIRID;
    private int originalAIRID;
    private float delayARR;
    private float cancel;

    public Serialization() {}

    public Serialization(int deatAIRID, int originalAIRID, float delayARR, float cancel) {
        this.destAIRID = deatAIRID;
        this.originalAIRID = originalAIRID;
        this.delayARR = delayARR;
        this.cancel = cancel;
    }
     public float getDelayARR() {
         return delayARR;
     }

     public float getCancel() {
         return cancel;
     }

     public int getDestAIRID() {
         return destAIRID;
     }

     public int getOriginalAIRID() {
         return originalAIRID;
     }


    }
