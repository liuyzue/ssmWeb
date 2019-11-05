package com.founder.entity;

public class DateForNow {
    Integer year;
    Integer month;
    Integer day;
    Integer quarter;

    public DateForNow() {
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getQuarter() {
        return quarter;
    }

    public void setQuarter(Integer quarter) {
        this.quarter = quarter;
    }

    @Override
    public String toString() {
        return "DateForNow{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", quarter=" + quarter +
                '}';
    }
}
