package repository;

import model.Rental;

import java.util.ArrayList;

public class RentalRepository implements IRentalRepository {

    private ArrayList<Rental> rentals;
    private static RentalRepository rentalRepository;

    private RentalRepository() {
        rentals = new ArrayList<>();
    }

    public static RentalRepository getRentalRepository() {
        if (rentalRepository == null) {
            rentalRepository = new RentalRepository();
        }
        return rentalRepository;
    }

    @Override
    public void add(Rental rental) {
        rental.setId(nextIdAvailable());
        rentals.add(rental);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public ArrayList findAll() {
        return null;
    }

    @Override
    public Rental findById(Long id) {
        return null;
    }

    @Override
    public void update(Rental rental) {

    }

    public Long nextIdAvailable() {
        if (!rentals.isEmpty()) {
            return rentals.getLast().getId() + 1;
        } else {
            return (long) 1;
        }
    }
}
