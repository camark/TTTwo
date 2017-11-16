package com.gm;

import javafx.concurrent.Task;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //System.out.println( "Hello World!" );

        Class<?> class1=Class.forName("com.gm.Ctt");

        Method[] methods=class1.getMethods();

        for (int i = 0; i < methods.length; i++) {
            System.out.println("----------------");
            Method method=methods[i];

            Parameter[]  ps=method.getParameters();
            System.out.println(method.getName());

            for(Parameter p :ps){
                System.out.println(p.getName()+":"+p.getType().toString());
            }
        }

        System.out.println("------Fields Begin-------------");
        Field[] fields=class1.getDeclaredFields();
        for(Field f :fields)
        {
            System.out.println(f.getName());
        }

        System.out.println("------Fields End-------------");

        Ctt ctt=(Ctt)class1.newInstance();

        ctt.setError(1);
        ctt.setMsg("hi");
        System.out.println(ctt.toString());

//        for (int j = 0; j < 5; j++) {
//            CountX cx=new CountX(String.valueOf(j),j+100);
//            Thread t=new Thread(cx);
//            t.start();
//        }
    }
}
