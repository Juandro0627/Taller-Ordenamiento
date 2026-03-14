package model.comparator;

import java.util.Comparator;
import model.Computer;

public class BrandAndOSComparator implements Comparator<Computer> {

    @Override
    public int compare(Computer c1, Computer c2) {

        int brandCompare = c1.getBrand().compareTo(c2.getBrand());

        if (brandCompare != 0) {
            return brandCompare;
        }

        return Character.compare(c1.getOperatingSystem(), c2.getOperatingSystem());
    }
}