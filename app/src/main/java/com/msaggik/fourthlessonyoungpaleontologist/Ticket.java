package com.msaggik.fourthlessonyoungpaleontologist;

import java.io.Serializable;

public class Ticket implements Serializable {
    private String name;
    private String email;
    private String placeFrom;
    private String dateFrom;
    private String placeTo;
    private String dateTo;

    public Ticket(String name, String email, String placeFrom, String dateFrom, String placeTo, String dateTo) {
        this.name = name;
        this.email = email;
        this.placeFrom = placeFrom;
        this.dateFrom = dateFrom;
        this.placeTo = placeTo;
        this.dateTo = dateTo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlaceFrom() {
        return placeFrom;
    }

    public void setPlaceFrom(String placeFrom) {
        this.placeFrom = placeFrom;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getPlaceTo() {
        return placeTo;
    }

    public void setPlaceTo(String placeTo) {
        this.placeTo = placeTo;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }
}
