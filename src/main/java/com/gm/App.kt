package com.gm

import javafx.concurrent.Task

import java.lang.reflect.Field
import java.lang.reflect.Method
import java.lang.reflect.Parameter

/**
 * Hello world!
 *
 */
object App {
    @Throws(ClassNotFoundException::class, IllegalAccessException::class, InstantiationException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        //System.out.println( "Hello World!" );

        val class1 = Class.forName("com.gm.Ctt")

        val methods = class1.methods

        for (i in methods.indices) {
            println("----------------")
            val method = methods[i]

            val ps = method.parameters
            println(method.name)

            for (p in ps) {
                println(p.name + ":" + p.type.toString())
            }
        }

        println("------Fields Begin-------------")
        val fields = class1.declaredFields
        for (f in fields) {
            println(f.name)
        }

        println("------Fields End-------------")

        val ctt = class1.newInstance() as Ctt

        ctt.error = 1
        ctt.msg = "1111"
        println(ctt.toString())

        //        for (int j = 0; j < 5; j++) {
        //            CountX cx=new CountX(String.valueOf(j),j+100);
        //            Thread t=new Thread(cx);
        //            t.start();
        //        }
    }
}
