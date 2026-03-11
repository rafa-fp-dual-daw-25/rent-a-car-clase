package model;

import java.util.Date;

public class Rental {

    private Long id;
    private Date startDate;
    private Date endDate;
    private Client client;
    private Car car;
    private RentalOffice rentalOffice;

    public Rental(Long id, Date startDate, Date endDate, Client client, Car car, RentalOffice rentalOffice) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.client = client;
        this.car = car;
        this.rentalOffice = rentalOffice;
    }

    public Rental(Date startDate, Date endDate, Client client, Car car, RentalOffice rentalOffice) {
        this(null, startDate, endDate, client, car, rentalOffice);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public RentalOffice getRentalOffice() {
        return rentalOffice;
    }

    public void setRentalOffice(RentalOffice rentalOffice) {
        this.rentalOffice = rentalOffice;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", client=" + client +
                ", car=" + car +
                ", rentalOffice=" + rentalOffice +
                '}';
    }
}