package com.softserveinc.envelope;

public class Envelope {

    private float a;
    private float b;
    private float c;
    private float d;

    Envelope(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    void compare() {
        if (a > c && b > d) {
            System.out.println("EnvelopeHandler number 1 is included in envelope number 2!");
        } else if (c > a && d > b) {
            System.out.println("EnvelopeHandler number 2 is included in envelope number 1!");
        } else if (a == c && b == d) {
            System.out.println("Envelopes are equal!");
        } else {
            System.out.println("Not one of the envelope is included in another!");
        }
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }
}
