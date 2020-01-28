package com.softserveinc.envelope;

public class Envelope {

    private float firstSide;
    private float secondSide;

    Envelope() {
    }

    Envelope(float firstSide, float secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    void compare(Envelope firstEnvelope, Envelope secondEnvelope) {
        if (firstEnvelope.getFirstSide() > secondEnvelope.getFirstSide()
                && firstEnvelope.getSecondSide() > secondEnvelope.getSecondSide()) {
            System.out.println("Second envelope can be placed into the first one.");
        } else if (firstEnvelope.getFirstSide() < secondEnvelope.getFirstSide()
                && firstEnvelope.getSecondSide() < secondEnvelope.getSecondSide()) {
            System.out.println("First envelope can be placed into the second one.");
        } else if (firstEnvelope.getFirstSide() == secondEnvelope.getFirstSide()
                && firstEnvelope.getSecondSide() == secondEnvelope.getSecondSide()) {
            System.out.println("Envelopes are equal.");
        } else {
            System.out.println("Envelopes can't be included into each other.");
        }
    }

    public float getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(float firstSide) {
        this.firstSide = firstSide;
    }

    public float getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(float secondSide) {
        this.secondSide = secondSide;
    }

}
