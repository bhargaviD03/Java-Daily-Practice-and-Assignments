package javaAssignment;

class Food {
    
    boolean isReady = false;

    synchronized void getFood() {

        try {
            while (!isReady) {
                System.out.println("Customer is waiting for food...");
                wait();
            }

            System.out.println("Customer received the food!");
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void prepareFood() {

        System.out.println("Chef is preparing food...");

        isReady = true;

        System.out.println("Chef prepared the food!");

        notify();
    }
}

public class WaitandNotify {

	public static void main(String[] args) {

        Food food = new Food();

        Thread customer = new Thread(() -> food.getFood());

        Thread chef = new Thread(() -> food.prepareFood());

        customer.start();

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        chef.start();
    }
}

