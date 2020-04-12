package com.softserveinc.model;

public class Envelope {

    private float firstSideOfFirstEnvelope;
    private float secondSideOfFirstEnvelope;
    private float firstSideOfSecondEnvelope;
    private float secondSideOfSecondEnvelope;


    public Envelope(float firstSideOfFirstEnvelope, float secondSideOfFirstEnvelope,
                    float firstSideOfSecondEnvelope, float secondSideOfSecondEnvelope) {
        this.firstSideOfFirstEnvelope = firstSideOfFirstEnvelope;
        this.secondSideOfFirstEnvelope = secondSideOfFirstEnvelope;
        this.firstSideOfSecondEnvelope = firstSideOfSecondEnvelope;
        this.secondSideOfSecondEnvelope = secondSideOfSecondEnvelope;
    }

    public float getFirstSideOfFirstEnvelope() {

        return firstSideOfFirstEnvelope;
    }

    public void setFirstSideOfFirstEnvelope(float firstSideOfFirstEnvelope) {
        this.firstSideOfFirstEnvelope = firstSideOfFirstEnvelope;
    }

    public float getSecondSideOfFirstEnvelope() {

        return secondSideOfFirstEnvelope;
    }

    public void setSecondSideOfFirstEnvelope(float secondSideOfFirstEnvelope) {
        this.secondSideOfFirstEnvelope = secondSideOfFirstEnvelope;
    }

    public float getFirstSideOfSecondEnvelope() {

        return firstSideOfSecondEnvelope;
    }

    public void setFirstSideOfSecondEnvelope(float firstSideOfSecondEnvelope) {
        this.firstSideOfSecondEnvelope = firstSideOfSecondEnvelope;
    }

    public float getSecondSideOfSecondEnvelope() {

        return secondSideOfSecondEnvelope;
    }

    public void setSecondSideOfSecondEnvelope(float secondSideOfSecondEnvelope) {
        this.secondSideOfSecondEnvelope = secondSideOfSecondEnvelope;
    }
}
