package com.gm;

/**
 * Created by Administrator on 2017-01-17.
 */
public class CountX implements Runnable {

    private int count;
    private String thread_id;
    public CountX(String id,int Count) {
        thread_id=id;
        count=Count;
    }

    public void run() {
        //synchronized (this) {
            for (int i = 0; i < count; i++) {
                System.out.println("Thread " + thread_id + ":" + i);
            }
        //}
    }
}
