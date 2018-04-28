public class SimpleDotCom {
    private int [] locationCells;
    int numOfHits = 0;

    public String checkYourself(String userGuess){
        int guess = Integer.parseInt(userGuess);
        String result = "Мимо";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }

    void setLocationCells(int[] loc){
        locationCells = loc;
    }
}
