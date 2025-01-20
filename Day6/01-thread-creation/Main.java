public class Main {

    // public static class ChildThreadTask implements Runnable {
    //     @Override
    //     public void run(){
    //         count();
    //     }

    // }

    public static void main(String[] args) {
        Thread childhThread = new Thread( ()->count(),"child");
        childhThread.start();
        count();
    }

    public static void count() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}