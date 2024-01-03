public class CheckDigit {
    public static void main(String[] args){

        int sum=0;
        int sum2=0;

        long number = Long.parseLong(args[0]);
        int count = 1;

        while(number>0){
            if(count%2!=0){
                sum += number%10;
            }
            else{
                sum2 += number%10;
            }

            number /= 10;
            count++;
        }

        sum %= 10;
        sum2 %= 10;

        sum2 *= 3;
        sum2 %= 10;

        int answer = sum+sum2;
        answer %= 10;
        
        System.out.println(answer);

    }
}