import java.util.ArrayList;

public class DotComBustTestDrive {
    public static void main(String[] args) {
        DotCom dot = new DotCom();
        ArrayList<String> location = new ArrayList<>(3);
        location.add(Integer.toString(1));
        location.add(Integer.toString(2));
        location.add(Integer.toString(3));
        //int[] location = {2,3,4};
        dot.setLocationCells(location);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "Неудача";
        if (result.equals("Попал")){
            testResult = "Пройден";
        }
        System.out.println(testResult);
    }
}
