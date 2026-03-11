package controller;

import model.Rental;
import service.IRentalService;
import service.RentalServiceImpl;

import java.util.ArrayList;
import java.util.Date;

public class RentalController {

    private IRentalService service;

    public RentalController() {
        service = new RentalServiceImpl();
    }

    public void add(Date startDate, Date endDate, Long idClient, Long idCar, Long idRentalOffice) {
        service.add(startDate, endDate, idClient, idCar, idRentalOffice);
    }

    public Rental findById(Long id) {
        return service.findById(id);
    }


    public void deleteById(Long id) {
        service.deleteById(id);

    }

    public ArrayList findAll() {
        return service.findAll();
    }


    public void update(Long id, Date startDate, Date endDate, Long idClient, Long idCar, Long idRentalOffice) {
        service.update(id, startDate, endDate, idClient, idCar, idRentalOffice);
    }
}
