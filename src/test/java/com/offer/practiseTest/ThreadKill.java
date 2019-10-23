package com.offer.practiseTest;

/**
 * @author zhugp
 * @description TODO
 * @date 2019/10/14 9:53
 */
public class ThreadKill{

    public static void main(String[] args){

//        Runtime.getRuntime().addShutdownHook(new Thread());
        new Thread(()->{
            while(true){
                System.out.println("thread is working");
                try{
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }



}
