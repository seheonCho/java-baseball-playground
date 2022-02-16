package numberBaseball.domain;

public class Game {

    final static int NUMBERS_OF_GAME = 3;

    public void play() {
        NumberCreater numberCreater = new NumberCreater();
        Computer computer = new Computer(numberCreater.getNumbers());

        Player player = new Player();
    }

}
