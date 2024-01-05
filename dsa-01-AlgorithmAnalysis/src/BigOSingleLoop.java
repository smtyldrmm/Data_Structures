public class BigOSingleLoop {

    public static void main(String[] args) {

        int numberOfOperation=0;
        int n=100; // it is size of data
        long startTime;
        long endTime;
        System.out.println("Input size n is ;" + n);

        // Task 1 Single Loop

        startTime=System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            numberOfOperation+=1;
        }
        endTime=System.currentTimeMillis();
        System.out.println("Single Loop Number Of Operation :" + numberOfOperation + " in " + (endTime-startTime)+ " milliseconds");
    }
}
