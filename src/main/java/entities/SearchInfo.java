package main.java.entities;

import java.util.List;

public class SearchInfo {
    private String regularExpression;
    private List<SignificantDateInterval> dateInterval;
    private String location;

    public List<SignificantDateInterval> getDateInterval() {
        return dateInterval;
    }

    public String getLocation() {
        return location;
    }

    public String getRegularExpression() {
        return regularExpression;
    }

    public void setDateInterval(List<SignificantDateInterval> dateInterval) {
        this.dateInterval = dateInterval;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRegularExpression(String regularExpression) {
        this.regularExpression = regularExpression;
    }
}
