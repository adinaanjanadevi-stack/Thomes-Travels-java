package com;

public class Travels {

    // Check if any car driver exists
    public boolean isCarDriver(Driver[] drivers) {
        for (Driver d : drivers) {
            if (d.getCategory().equalsIgnoreCase("car")) {
                return true;
            }
        }
        return false;
    }

    //  Retrieve driver by ID
    public String retrivebyDriverId(Driver[] drivers, int driverId) {
        for (Driver d : drivers) {
            if (d.getDriverId() == driverId) {
                return "Driver name is " + d.getDriverName()
                        + " Belonging to the category " + d.getCategory()
                        + " traveled " + d.getTotalDistance()
                        + " KM so far.";
            }
        }
        return "Driver not found";
    }

    // Count drivers by category
    public int retriveCountOfDriver(Driver[] drivers, String category) {
        int count = 0;
        for (Driver d : drivers) {
            if (d.getCategory().equalsIgnoreCase(category)) {
                count++;
            }
        }
        return count;
    }

    //  Retrieve drivers by category
    public Driver[] retriveDriver(Driver[] drivers, String category) {

        int count = 0;
        for (Driver d : drivers) {
            if (d.getCategory().equalsIgnoreCase(category)) {
                count++;
            }
        }

        Driver[] result = new Driver[count];
        int index = 0;

        for (Driver d : drivers) {
            if (d.getCategory().equalsIgnoreCase(category)) {
                result[index++] = d;
            }
        }
        return result;
    }

    //  Max distance travelled driver
    public Driver RetriveMaximumDistanceTravelledDriver(Driver[] drivers) {

        Driver maxDriver = drivers[0];

        for (Driver d : drivers) {
            if (d.getTotalDistance() > maxDriver.getTotalDistance()) {
                maxDriver = d;
            }
        }
        return maxDriver;
    }
}
