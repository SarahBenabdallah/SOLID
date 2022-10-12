package com.directi.training.srp.exercice_refactored;

public class CarManager
{
    private final CarDb _carDb;
    private final CarFormatter _carFormatter;
    private final CarComparator _carComparator;

    public CarManager(CarDb carDb, CarFormatter carFormatter, CarComparator carComparator)
    {
        _carDb = carDb;
        _carFormatter = carFormatter;
        _carComparator = carComparator;
    }

    public Car getCarById(final String carId)
    {
        return _carDb.getfromdb(carId);
    }

    public String getCarsNames()
    {
        return _carFormatter.getCarsNames(_carDb.getcardb());
    }

    public Car getBestCar()
    {
        return _carComparator.getBestCar(_carDb.getcardb());
    }
}