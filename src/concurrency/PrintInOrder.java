package concurrency;

public class PrintInOrder {
    static class  Foo {

        private boolean firstDone;
        private boolean secondDone;

        public Foo() {
            firstDone = false;
            secondDone = false;
        }

        public void first(Runnable printFirst) throws InterruptedException {

            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            firstDone = true;
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (!firstDone) {}
                // printSecond.run() outputs "second". Do not change or remove this line.
                printSecond.run();
            secondDone= true;
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (!secondDone) {}
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }
}
