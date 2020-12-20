package Lesson_4;

public class Main {
    private final Object mon = new Object();
    private volatile char currentLetter = 'A';
    public static void main(String[] args) {


            Main w = new Main();
            Thread t1 = new Thread(() -> {
                w.methodA();
            });
            Thread t2 = new Thread(() -> {
                w.methodB();
            });

            Thread t3 = new Thread(()-> {
                w.methodC();
            });
                t1.start();
                t2.start();
                t3.start();
        }

        public void methodA() {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (currentLetter != 'A') {
                            mon.wait();
                        }
                        System.out.print("A");
                        currentLetter = 'B';
                        mon.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void methodB() {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (currentLetter != 'B') {
                            mon.wait();
                        }
                        System.out.print("B");
                        currentLetter = 'C';
                        mon.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        public void methodC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'C') {
                        mon.wait();
                    }

                    System.out.println("C");
                    currentLetter = 'A';
                    mon.notifyAll();

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


