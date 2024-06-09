package org.gfg.server;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerDemo {

    public static void main(String[] args) {
        System.out.println("Enter your name");
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String data = scanner.nextLine();

            if (data.equalsIgnoreCase("stop")) {
                System.exit(0);
            }
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("You entered the value: "+ data + " with thread " + Thread.currentThread().getName());
                }
            });
        }
    }

}
