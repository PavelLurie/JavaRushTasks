package com.javarush.task.task17.task1714;

/* 
Comparable
*/

import static java.lang.Float.compare;

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {

        return name;
    }

    public synchronized void setName(String name) {

        this.name = name;
    }

    public synchronized float getDistance() {

        return distance;
    }

    public synchronized void setDistance(float distance) {

        this.distance = distance;
    }

    public synchronized int getQuality() {

        return quality;
    }

    public synchronized void setQuality(int quality) {

        this.quality = quality;
    }

    public static void main(String[] args) {
        Integer A = 31;
        A.compare(A, 45);
    }

    @Override
    public synchronized int compareTo(Beach o) {
        int kachestvo = 0;

        int a = compare(this.quality, o.quality);
        float b = compare(this.distance, o.distance);
        return kachestvo = (int) (a - b);
        //return 0;
    }
}
