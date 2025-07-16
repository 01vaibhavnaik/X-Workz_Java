package com.xworkz.map;

public class TrainDTO {
    String trainName;
    String trainSource;
    String trainDestination;
    int startTime;
    int reachTime;

    public TrainDTO(String trainName, String trainSource, String trainDestination, int startTime, int reachTime) {
        this.trainName = trainName;
        this.trainSource = trainSource;
        this.trainDestination = trainDestination;
        this.startTime = startTime;
        this.reachTime = reachTime;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getTrainSource() {
        return trainSource;
    }

    public String getTrainDestination() {
        return trainDestination;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getReachTime() {
        return reachTime;
    }

    @Override
    public String toString() {
        return "TrainDTO{" +
                "trainName='" + trainName + '\'' +
                ", trainSource='" + trainSource + '\'' +
                ", trainDestination='" + trainDestination + '\'' +
                ", startTime=" + startTime +
                ", reachTime=" + reachTime +
                '}';
    }
}
