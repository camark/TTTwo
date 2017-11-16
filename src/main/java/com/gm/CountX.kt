package com.gm

/**
 * Created by Administrator on 2017-01-17.
 */
class CountX(private val thread_id: String, private val count: Int) : Runnable {

    override fun run() {
        //synchronized (this) {
        for (i in 0..count - 1) {
            println("Thread $thread_id:$i")
        }
        //}
    }
}
