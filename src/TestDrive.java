
public class TestDrive {

    Player p1;
    Player p2;
    Player p3;

    public void startGame(){

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guess1 = 0;
        int guess2 = 0;
        int guess3 = 0;

        boolean p1Right = false;
        boolean p2Right = false;
        boolean p3Right = false;

        int targetNr = (int) (Math.random() * 10);
        //System.out.println("SECRET: The right number is: " + targetNr);
       // System.out.println("Number between 0 and 9");


        while (true){

            p1.guess();
            p2.guess();
            p3.guess();

            guess1 = p1.number;
            System.out.println("Player one guessed : " + guess1);
            guess2 = p2.number;
            System.out.println("Player two guessed : " + guess2);
            guess3 = p3.number;
            System.out.println("Player three guessed : " + guess3);

            if (guess1 == targetNr){
                p1Right = true;
            }

            if (guess2 == targetNr){
                p2Right = true;
            }

            if (guess3 == targetNr){
                p3Right = true;
            }

            if (p1Right || p2Right || p3Right){

                System.out.println("We have a winer");
                System.out.println("Player one is right?" + p1Right);
                System.out.println("Player two is right?" + p2Right);
                System.out.println("Player three is right?" + p3Right);
                System.out.println("Game over");
                break;

            } else {
                System.out.println("Try again");
            }
        }
    }
}
