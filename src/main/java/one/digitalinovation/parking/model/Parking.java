package one.digitalinovation.parking.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Parking {

    private String id;
    private String licence;
    private String state;
    private String model;
    private String color;
    private LocalDateTime entryDate;
    private LocalDateTime exiteDate;
    private Double bill;

    public Parking(String id, String licence, String state, String model, String color) {
        this.id = id;
        this.licence = licence;
        this.state = state;
        this.model = model;
        this.color = color;
    }

    public Parking() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDateTime getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDateTime getExiteDate() {
        return exiteDate;
    }

    public void setExiteDate(LocalDateTime exiteDate) {
        this.exiteDate = exiteDate;
    }

    public Double getBill() {
        return bill;
    }

    public void setBill(Double bill) {
        this.bill = bill;
    }
}
