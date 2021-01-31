package com.company.asquith;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cMajor[] = {"C", "D", "E", "F", "G" ,"A" ,"B", "C"};
        String fMajor[] = {"F","G","A","Bb","C","D","E","F"};
        String BbMajor[] = {"Bb","C","D","Eb","F","G","A","Bb"};
        String EbMajor[] = {"Eb","F","G","Ab","Bb","C","D","Eb"};
        String AbMajor[] = {"Ab","Bb","C","Db","Eb","F","G","Ab"};
        String DbMajor[] = {"Db","Eb","F","Gb","Ab","Bb","C","Db"};
        String GbMajor[] = {"Gb","Ab","Bb","Cb","Db","Eb","F","Gb"};
        String BMajor[] = {"B","C#","D#","E","F#","G#","A#","B"};
        String EMajor[] = {"E","F#","G#","A","B","C#","D#","E"};
        String AMajor[] = {"A","B","C#","D","E","F#","G#","A"};
        String DMajor[] = {"D","E","F#","G","A","B","C#","D"};
        String GMajor[] = {"G","A","B","C","D","E","F#","G"};

        String scaleNames[] = {"C Major","F Major","Bb Major","Eb Major","Ab Major","Db Major","Gb Major","B Major","E Major","A Major","D Major","G Major"};

        Random rand = new Random();
        int randScale = rand.nextInt(12);
        int randDegree = rand.nextInt(8);

        switch(randDegree += 1){
            case 1:
                System.out.println("What is the " + (randDegree) + "st degree in the " + scaleNames[randScale] + " Scale?");
                break;
            case 2:
                System.out.println("What is the " + (randDegree) + "nd degree in the " + scaleNames[randScale] + " Scale?");
                break;
            case 3:
                System.out.println("What is the " + (randDegree) + "rd degree in the " + scaleNames[randScale] + " Scale?");
                break;
            default:
                System.out.println("What is the " + (randDegree) + "th degree in the " + scaleNames[randScale] + " Scale?");
                break;
        }
    }
}