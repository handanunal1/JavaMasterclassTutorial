package main.java.concurrency.thread;

import static main.java.concurrency.thread.ThreadColor.ANSI_RED;

/**
 * Created by Handan Unal
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run()");
    }
}
