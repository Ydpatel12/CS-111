public class RandomWalker {
    public static void main(String [] args){
        int counter = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;

        System.out.println("(" + x + "," + y + ")");

        while(counter > 0){
            double randomNum = Math.random();

            if(randomNum < .25){
                y++;
                //North
            }

            else if (randomNum > .25 && randomNum < .50){
                x++;
                //East
            }

            else if (randomNum > .50 && randomNum < .75){
                y--;
                //South
            }

            else if (randomNum > .75 && randomNum < 1.00){
                x--;
                //West
            }

            counter--;
            System.out.println("(" + x + "," + y + ")");

        }
        double square = (x*x) + (y*y);
        System.out.println("Squared distance = " + square);

    }
    
}
