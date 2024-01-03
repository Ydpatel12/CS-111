public class LargestOfFive {
    public static void main (String [] args){

        int Num1 = Integer.parseInt(args [0]);
        int Num2 = Integer.parseInt(args [1]);
        int Num3 = Integer.parseInt(args [2]);
        int Num4 = Integer.parseInt(args [3]);
        int Num5 = Integer.parseInt(args [4]);

        if(Num1 > Num2 && Num1 > Num3 && Num1 > Num4 && Num1 > Num5){
        System.out.println(Num1);
        }

        else if(Num2 > Num3 && Num2 > Num4 && Num2 > Num5){
            System.out.println(Num2);
        }

        else if(Num3 > Num4 && Num3 > Num5){
            System.out.println(Num3);
        }

        else if(Num4 > Num5){
            System.out.println(Num4);
        }

        else{
            System.out.println(Num5);
        }

    }
    
}
