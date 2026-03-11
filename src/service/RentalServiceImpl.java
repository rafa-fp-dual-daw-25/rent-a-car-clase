package service;

import model.Car;
import model.Client;
import model.Rental;
import model.RentalOffice;
import repository.IRentalRepository;

import java.util.ArrayList;
import java.util.Date;

public class RentalServiceImpl implements IRentalService {
    private IRentalRepository repository;
    private IModelService modelService;
    private IRentalOfficeService rentalOfficeService;
    private ICarService carService;
    private IClientService clientService;

    @Override
    public Rental findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void add(Date startDate, Date endDate, Long idClient, Long idCar, Long idRentalOffice) {

        Rental rental = new Rental(startDate, endDate, clientService.findById(idClient), carService.findById(idCar), rentalOfficeService.findById(idRentalOffice));

        repository.add(rental);

        Client client = clientService.findById(idClient);
        client.addRental(rental);

        Car car = carService.findById(idCar);
        car.addRental(rental);

        RentalOffice rentalOffice = rentalOfficeService.findById(idRentalOffice);
        rentalOffice.addRental(rental);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public ArrayList findAll() {
        return repository.findAll();
    }

    @Override
    public void update(Long id, Date startDate, Date endDate, Long idClient, Long idCar, Long idRentalOffice) {
        repository.update(new Rental(startDate, endDate, clientService.findById(idClient), carService.findById(idCar), rentalOfficeService.findById(idRentalOffice)));
    }
}
