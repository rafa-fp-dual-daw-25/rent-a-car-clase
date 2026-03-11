package service;

import model.Rental;

import java.util.ArrayList;
import java.util.Date;

public interface IRentalService {

    Rental findById(Long id);

    void add(Date startDate, Date endDate, Long idClient, Long idCar, Long idRentalOffice);

    void deleteById(Long id);

    ArrayList findAll();

    void update(Long id, Date startDate, Date endDate, Long idClient, Long idCar, Long idRentalOffice);
}
