package model;
import java.util.Arrays;
import java.util.Comparator;


public class ComputersSale {

    private Computer[] computers;

    public ComputersSale(Computer[] computers) {
        this.computers = computers;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void  sortByBrand(){
        for(int i=0; i<computers.length;i++){
            Computer key = computers[i];
            int j = - 1;

            while(j >= 0 && computers[j].compareTo(key) >0){
                computers[j + 1]= computers[j];
                j--;
            }
            computers[j + 1] = key;
        }
    }

    public void sortByProcessing(){
        for(int i=0; i<computers.length;i++){
            for(int j=0; j<computers.length - 1 - i ;j++){

                double p1= computers[j].getProcessors()*computers[j].getProcessingSpeed();
                double p2= computers[j+1].getProcessors()*computers[j+1].getProcessingSpeed();

                if(p1 > p2){
                    Computer temp = computers[j];
                    computers[j] = computers[j+1];
                    computers[j+1]= temp;
                }
            }
        }
    }

    public void sortByBrandAndOs(){
        Arrays.sort(computers, new Comparator<Computer>() {

            @Override
            public int compare(Computer c1, Computer c2) {

                int brandCompare = c1.getBrand().compareTo(c2.getBrand());

                if(brandCompare != 0){
                    return brandCompare;
                }

                return Character.compare(c1.getOperatingSystem(), c2.getOperatingSystem());
            }

        });
    }

    public void sortByRam(){
        Arrays.sort(computers, new Comparator<Computer>() {

            @Override
            public int compare(Computer c1, Computer c2) {
                return Integer.compare(c1.getRam(), c2.getRam());
            }

        });
    }

    public void sortByBrandReverse(){
        Arrays.sort(computers, new Comparator<Computer>() {

            @Override
            public int compare(Computer c1, Computer c2) {
                return c2.compareTo(c1);
            }

        });
    }
     public Computer[] generateRandomComputers(int c){

         return new Computer[0];
     }


}
