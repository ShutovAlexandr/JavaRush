import java.io.IOException;
import java.util.Objects;

public class SimpleDotComGame {
    public static void main(String[] args) throws IOException {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        int num = (int) (Math.random() * 5);
        int[] loc = {num, num+1, num+2};
        simpleDotCom.setLocationCells(loc);
        String s = null;

        while(!Objects.equals(s, "Потопил")){
            String guess = helper.getUserInput("Введите число");
            s = simpleDotCom.checkYourself(guess);
            numOfGuesses++;
        }
        System.out.println("Вам потребовалось: " + numOfGuesses + " попыток(и)");
    }
}
