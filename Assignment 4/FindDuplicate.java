public class FindDuplicate {
    public static void main(String[] args) {

        boolean duplicate = false;
        
        int n = args.length;

        for(int i = 0; i < n;  i++){
            int dupes = -1;

            for(int j = 0; j < n; j++){

                if(Integer.parseInt(args[i]) == Integer.parseInt(args[j])){
                    dupes++;
                }

            }
            if (dupes > 0){
                duplicate = true;
            }
        }
        System.out.println(duplicate);
    }
}