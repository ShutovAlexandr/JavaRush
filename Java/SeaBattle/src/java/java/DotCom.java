import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;
    //int numOfHits = 0;

    public String checkYourself(String userInput){
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        System.out.println(result);
        return result;
    }

    void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }
    void setName(String name){
        this.name = name;
    }
}
