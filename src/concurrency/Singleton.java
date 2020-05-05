package concurrency;

public class Singleton {


    public static class Simple {
        public static final Simple instance = new Simple();

        private Simple() {

        }
    }

    public static class SimpleLazy {
        private static SimpleLazy instance;

        private SimpleLazy() {

        }

        public synchronized static SimpleLazy getInstance() {
            if (instance == null) {
                instance = new SimpleLazy();
            }
            return instance;
        }
    }

    public static class DoubleLock {
        private static DoubleLock instance;

        private DoubleLock() {

        }

        public static DoubleLock getInstance() {
            DoubleLock local = instance;
            if (local == null) {
                synchronized (DoubleLock.class) {
                    local = instance;
                    if (local == null) {
                        instance = local = new DoubleLock();
                    }
                }
            }
            return local;
        }
    }
}
