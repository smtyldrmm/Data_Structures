public class BigOSingleLoop {

        public static void main(String[] args) {

        long numberOfOperation=0;
        int n=1000; // it is size of data
        int m=500;
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
        // Task 1 End

        // Task 2 Nested Loop
        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n ; i++) {
                numberOfOperation+=1;
            }
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Nested Loop Number of operations : "+numberOfOperation + " in "+ (endTime-startTime) +" milliseconds");
        // Task 2 End


        // Task 3 Three Nested Loops

        numberOfOperation=0;
        startTime=System.currentTimeMillis();
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n ; i++) {
                    for (int k = 0; k < n; k++) {
                        numberOfOperation+=1;
                    }
                }
            }
        endTime=System.currentTimeMillis();
            System.out.println( "Triple Nested Loop Number of operations : "+numberOfOperation + " in "+ (endTime-startTime) +" milliseconds");
        // Task 3 End


        // Task 4 N and M Nested Loops
            numberOfOperation=0;

            startTime=System.currentTimeMillis();
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < m ; i++) {
                    numberOfOperation+=1;
                }
            }
            endTime=System.currentTimeMillis();

            System.out.println( "Nested Loop (n* m) Number of operations : "+numberOfOperation + " in "+ (endTime-startTime) +" miliseconds");
        // Task 4 End


        // Task 5 Logarithmic Complexity
            numberOfOperation=0;
            startTime=System.currentTimeMillis();
            for (int i = 1; i < n ; i*=2) {
                numberOfOperation+=1;
            }
            endTime=System.currentTimeMillis();
            System.out.println( "Logarithmic Number of operations  : "+numberOfOperation + " in "+ (endTime-startTime) +" milliseconds");

        // Task 5 End
    }
}
