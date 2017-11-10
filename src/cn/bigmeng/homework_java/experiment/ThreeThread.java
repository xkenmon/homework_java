package cn.bigmeng.homework_java.experiment;


import java.util.ArrayList;
import java.util.Date;

public class ThreeThread {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<MyThread> threadList = new ArrayList<MyThread>();
        for (int i = 0; i < 3; i++) {
            threadList.add(new MyThread(i + 1));
            new Thread(threadList.get(i)).start();
            Thread.sleep(1000);
        }


        Thread.sleep(10000);

        for (MyThread thread : threadList) {
            thread.stop();
            Thread.sleep(1000);
        }

        System.out.println("Exit...");
    }


    static class MyThread implements Runnable {
        Date start;
        boolean stopFlag = false;
        int id;

        MyThread(int id) {
            this.start = new Date();
            this.id = id;
        }

        public void stop() {
            this.stopFlag = true;
            System.out.println("Thread " + id + " stop on "+new Date());
        }

        public void run() {
            System.out.println("Thread " + id + " already started on "+new Date());
            while (!stopFlag) {
                System.out.println("Thread ID: " + id + "\t已运行: " + (new Date().getTime() - start.getTime()) + " ms...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
