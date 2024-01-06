public class BigOSingleLoop {

    public static void main(String[] args) {

        long numberOfOperation=0;
        int n=1000000; // it is size of data
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
        // Task 2 Nested Loop
        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n ; i++) {
                numberOfOperation+=1;
            }
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Nested Loop Number of operations : "+numberOfOperation + " in "+ (endTime-startTime) +" milliseconds");

    }
}
