package javaAssignment;

class Company {

    boolean productAvailable = false;

    synchronized void produce() {

        System.out.println("Producer is producing a product...");

        productAvailable = true;

        System.out.println("Product is ready!");

        notify();      
        notifyAll();  
    }

    synchronized void consume(String name) {

        try {

            while (!productAvailable) {

                System.out.println(name + " is waiting for product...");
                wait();
            }

            System.out.println(name + " consumed the product.");

            productAvailable = false;

        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}


public class ProducerandConsumers {

	public static void main(String[] args) {
        Company c = new Company();

        Thread c1 = new Thread(() -> c.consume("Consumer 1"));
        Thread c2 = new Thread(() -> c.consume("Consumer 2"));
        Thread c3 = new Thread(() -> c.consume("Consumer 3"));

        c1.start();
        c2.start();
        c3.start();

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        Thread p = new Thread(() -> c.produce());

        p.start();
    }
}
