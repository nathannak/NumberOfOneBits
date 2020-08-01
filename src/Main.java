public class Main {

    public static void main(String[] args) {
        System.out.println( countOnes(15));
    }

    private static int countOnes( int n) {

        int count=0;

        for(int i = 0 ; i < 32 ; i++) {

            if( ((n >> i) & 1)==1) count++;

        }

        return count;

    }


}
