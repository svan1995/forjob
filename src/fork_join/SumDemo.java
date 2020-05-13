package fork_join;

import java.util.concurrent.*;

public class SumDemo extends RecursiveTask<Long> {

    private int start;
    private int end;

    private static final int THRESHOLD = 1000000;

    public SumDemo(int start, int end) {
        this.start = start;
        this.end = end;
    }



    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long sum = 0l;

        long start1 = System.currentTimeMillis();
        for (int i=0; i<=1000000000; i++){
            sum += i;
        }
        System.out.println("take " + (System.currentTimeMillis() - start1) + " mills");
        System.out.println(sum);

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        SumDemo task = new SumDemo(0, 1000000000);
        start1 = System.currentTimeMillis();
        Future<Long> result = forkJoinPool.submit(task);

        System.out.println(result.get());
        System.out.println("take " + (System.currentTimeMillis() - start1) + " mills");

    }

    @Override
    protected Long compute() {
        long sum = 0l;
        boolean canCompute = (end - start) <= THRESHOLD;
        if (canCompute){
            for (int i=start; i<=end; i++){
                sum += i;
            }
        }else {
            int middle = (start + end) / 2;
            SumDemo left = new SumDemo(start, middle);
            SumDemo right = new SumDemo(middle + 1, end);
            left.fork();
            right.fork();
            Long leftResult = left.join();
            Long rightResult = right.join();
            sum = leftResult + rightResult;
        }
        return sum;
    }
}
