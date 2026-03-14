package model;
import java.util.Arrays;
import model.comparator.BrandAndOSComparator;

public class ComputersSale {

    private Computer[] computers;

    public ComputersSale(Computer[] computers) {
        this.computers = computers;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void  sortByBrand(){

    }

    public void sortByProcessing(){

    }

    public void sortByBrandAndOs(){
        Arrays.sort(computers, new BrandAndOSComparator());

    }

    public void sortByRam(){

    }

    public void sortByBrandReverse(){

    }
     public Computer[] generateRandomComputers(int c){

         return new Computer[0];
     }


}
