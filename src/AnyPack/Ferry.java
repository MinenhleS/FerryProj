package AnyPack;

public class Ferry {

    int numOfCars;
    int numOfPeople;

    public Ferry(int numOfCars, int numOfPeople){

        this.numOfCars = numOfCars;
        this.numOfPeople = numOfPeople;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public int getNumOfCars() {
        return numOfCars;
    }

    public String board(){
        int TotalPeople = 100;
        int TotalCars = 50;
        int sum = TotalCars + TotalPeople;
        System.out.println(sum);
        if(sum > 200){
            return "Rejected!";
        }else{
            return "Accepted!";
        }
    }
}
