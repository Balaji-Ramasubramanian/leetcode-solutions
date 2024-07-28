// Problem URL: https://leetcode.com/problems/print-in-order/

/**
 * We initialised 2 boolean vars that indicates wheather 1st & 2nd methods are completed or not. 
 * method second() have logic to wait() until firstDone is true & third() waits until secondDone is true.
 * Once first() is printed, we're enabling firstDone boolean and using notifyAll(), the other threads are notified about the change and re-execute.
 */
class Foo {
    private boolean firstDone = false;
    private boolean secondDone = false;
    
    public Foo() {
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
    
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstDone = true;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while(!firstDone){
            wait();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        secondDone = true;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while(!secondDone){
            wait();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}