package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<Thread>(5);

    public static class Thread1 extends Thread
    {
        public void run() {
            while (true){}
        }
    }

    public static class Thread2 extends Thread
    {
        public void run(){
            try
            {
                while (!isInterrupted())
                {

                }
                throw new InterruptedException();
            }
            catch (InterruptedException e)
            {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread{
        public void run(){
            while (!isInterrupted()){
                try
                {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {}
            }
        }
    }

    public static class Thread4 extends Thread implements Message{
        public Thread4() {
            super();
        }

        public void run(){
            while(!isInterrupted())
            {}
            return;
        }

        @Override
        public void showWarning()
        {
            this.interrupt();
            try{
                this.join();
            } catch (InterruptedException e) {}
        }
    }

    public static class Thread5 extends Thread{
        public void run(){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            try
            {
                String s = reader.readLine();
                while (!s.equals("N")){
                    try
                    {
                        sum += Integer.parseInt(s);
                    }catch (NumberFormatException e){}
                    s = reader.readLine();
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println(sum);
        }
    }

    static
    {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }
}

