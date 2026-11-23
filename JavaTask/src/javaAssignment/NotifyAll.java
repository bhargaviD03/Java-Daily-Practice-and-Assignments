package javaAssignment;

class Exam {

    boolean resultPublished = false;

    synchronized void checkResult(String name) {

        try {
            System.out.println(name + " is waiting for results...");

            while (!resultPublished) {
                wait();
            }

            System.out.println(name + " received the result!");
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void publishResult() {

        System.out.println("Teacher is publishing results...");

        resultPublished = true;

        System.out.println("Results published!");

        notifyAll();
    }
}


public class NotifyAll {

	public static void main(String[] args) {

        Exam exam = new Exam();

        Thread s1 = new Thread(() -> exam.checkResult("Student 1"));
        Thread s2 = new Thread(() -> exam.checkResult("Student 2"));
        Thread s3 = new Thread(() -> exam.checkResult("Student 3"));

        s1.start();
        s2.start();
        s3.start();

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        exam.publishResult();
    }
}

