package com.example.project;
import java.util.Random;

public class Day4 {
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int distanceTraveled;
        private int timeRunning;
        private int timeResting;
        private boolean needRest;
        private static int farthestDistance = 0;
        private static String winnerName = "";

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            distanceTraveled = 0;
            timeRunning = 0;
            timeResting = 0;
            needRest = false;
        }

        public int getDistanceTraveled(){ // this method is required
            return distanceTraveled;
        }
        
        public String getName() {
            return name;
        }

        public static int getFarthestDistance() {
            return farthestDistance;
        }

        public static void setFarthestDistance(int newFarthestDistance) {
            farthestDistance = newFarthestDistance;
        }

        public static String getWinnerName() {
            return winnerName;
        }

        public static void setWinnerName(String newWinnerName) {
            winnerName = newWinnerName;
        }

        public void simulateSecond(){ //this method is required but not tested
            if (needRest) {
                timeResting++;
                if (timeResting == restDuration) {
                    needRest = false;
                    timeResting++;
                }
            } else {
                distanceTraveled += speed;
                timeRunning++;
                if (timeRunning == runDuration) {
                    needRest = true;
                    timeRunning = 0;
                }
            }
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        Reindeer.setFarthestDistance(0);
        Reindeer.setWinnerName("");
        for (int i = 1; i <= time; i++) {
            for (int j = 0; j < reindeers.length; j++) {
                reindeers[j].simulateSecond();
                if (reindeers[j].getDistanceTraveled() > Reindeer.getFarthestDistance()) {
                    Reindeer.setFarthestDistance(reindeers[j].getDistanceTraveled());;
                    Reindeer.setWinnerName(reindeers[j].getName());
                }
            }
        }
        return Reindeer.getWinnerName();
    }

    
    public static void main(String[] args) { // for testing purposed

    }

 
}



