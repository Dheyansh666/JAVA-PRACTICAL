import java.util.Scanner;

class SumTask implements Runnable {
    private int localStart;
    private int localEnd;
    private long partialSum = 0;

    public SumTask(int localStart, int localEnd) {
        this.localStart = localStart;
        this.localEnd = localEnd;
    }

    public void run() {
        for (int i = localStart; i <= localEnd; i++) {
            partialSum += i;
        }
    }

    public long getPartialSum() {
        return partialSum;
    }
}

public class Prac33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the value of N (number to sum up to): ");
            int N = scanner.nextInt();

            System.out.print("Enter the number of threads: ");
            int numberOfThreads = scanner.nextInt();

            if (N <= 0 || numberOfThreads <= 0) {
                System.out.println("N and the number of threads must be positive integers.");
                return;
            }

            int rangePerThread = N / numberOfThreads;
            int remainingNumbers = N % numberOfThreads;

            Thread[] threads = new Thread[numberOfThreads];
            SumTask[] tasks = new SumTask[numberOfThreads];

            int start = 1;
            for (int i = 0; i < numberOfThreads; i++) {
                int end = start + rangePerThread - 1;
                if (i < remainingNumbers) {
                    end++;
                }
                tasks[i] = new SumTask(start, end);
                threads[i] = new Thread(tasks[i]);
                start = end + 1; 
            }

            for (Thread thread : threads) {
                thread.start();
            }

            for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            long totalSum = 0;
            for (SumTask task : tasks) {
                totalSum += task.getPartialSum();
            }

            System.out.println("The sum of numbers from 1 to " + N + " is: " + totalSum);
        } finally {
            scanner.close();
        }
    }
}
