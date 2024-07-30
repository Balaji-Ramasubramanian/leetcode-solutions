// Problem URL: https://leetcode.com/problems/print-foobar-alternately/

/**
 * 
 */
class FooBar {
    private int n;
    private boolean executeFoo = true;

    public FooBar(int n) {
        this.n = n;
    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            if(!executeFoo){
                wait();
            }
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            executeFoo = false;
            notifyAll();
        }
    }

    public synchronized void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            if(executeFoo){
                wait();
            }
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            executeFoo = true;
            notifyAll();
        }
    }
}