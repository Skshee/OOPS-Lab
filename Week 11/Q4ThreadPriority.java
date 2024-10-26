public class Q4ThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                System.out.println("Thread with priority: " + Thread.currentThread().getPriority());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        });

        t1.setPriority(Thread.MAX_PRIORITY); 
        t1.start();

        
        t1.interrupt();
    }
}
