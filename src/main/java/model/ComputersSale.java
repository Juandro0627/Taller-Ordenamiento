package model;

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

    }

    public void sortByBrandAndOs(){

    }

    public void sortByRam(){

    }

    public void sortByBrandReverse(){

    }
     public Computer[] generateRandomComputers(int c){

         return new Computer[0];
     }


}
