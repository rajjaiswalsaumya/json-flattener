/**
 * Created by grohit on 9/11/15.
 */

import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumerService implements ProducerConsumerEvent {
    ExecutorServiceThreadPool executorServiceThreadPool;

    public static void main(String[] args) {
        ProducerConsumerService prodconsumer = new ProducerConsumerService();
        prodconsumer.init();

    }

    private void init() {
        executorServiceThreadPool = new ExecutorServiceThreadPool();
        for (int i = 0; i < 100; i++) {
            executorServiceThreadPool.addThread(new Producer(i, this));
            executorServiceThreadPool.addThread(new Consumer());
        }
        executorServiceThreadPool.finish();
    }

    @Override
    public Object consumed(Object data) {
        Logger.getLogger(ExecutorServiceThreadPool.class.getName()).log(Level.INFO, "Invoking consumed from outside " + data);
        return data;
    }

    @Override
    public Object produced(Object data) {
        Logger.getLogger(ExecutorServiceThreadPool.class.getName()).log(Level.INFO, "Invoking produced from outside " + data);
        return data;
    }

    private class Producer implements Runnable, ProducerEvent {
        int data;
        ProducerEvent producerEvent;


        public Producer(int datatoput) {
            this(datatoput, null);
        }

        public Producer(int datatoput, ProducerEvent producerEvent) {
            this.data = datatoput;
            this.producerEvent = producerEvent;
        }

        @Override
        public void run() {
            try {
                Logger.getLogger(ExecutorServiceThreadPool.class.getName()).log(Level.INFO, "Running producer");
                executorServiceThreadPool.queue.put(data);
                if (producerEvent != null)
                    producerEvent.produced(data);
                else
                    this.produced(data);
                if (executorServiceThreadPool.queue.size() >= 5) {
                    Logger.getLogger(ExecutorServiceThreadPool.class.getName()).log(Level.INFO, "Sleeping producer");
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
            }
        }

        @Override
        public Object produced(Object data) {
            Logger.getLogger(ExecutorServiceThreadPool.class.getName()).log(Level.INFO, "Producing Element " + data);
            return data;
        }
    }

    private class Consumer implements Runnable, ConsumerEvent {
        int datatake;
        ConsumerEvent consumerEvent;

        public Consumer() {
        }

        public Consumer(ConsumerEvent consumerEvent) {
            this.consumerEvent = consumerEvent;
        }

        @Override
        public void run() {
            try {
                Logger.getLogger(ExecutorServiceThreadPool.class.getName()).log(Level.INFO, "Running consumer");
                datatake = executorServiceThreadPool.queue.take();
                if (consumerEvent != null)
                    consumerEvent.consumed(datatake);
                else
                    this.consumed(datatake);
                if (executorServiceThreadPool.queue.size() == 0) {
                    Logger.getLogger(ExecutorServiceThreadPool.class.getName()).log(Level.INFO, "Sleeping consumer");
                    Thread.sleep(200);
                }
            } catch (NullPointerException e) {
                Logger.getLogger(ExecutorServiceThreadPool.class.getName()).log(Level.INFO, null, e);
            } catch (InterruptedException e) {
            }
        }

        @Override
        public Object consumed(Object data) {
            Logger.getLogger(ExecutorServiceThreadPool.class.getName()).log(Level.INFO, "Consuming Element " + data);
            return data;
        }
    }
}

class ExecutorServiceThreadPool {
    final BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(50, true);
    ExecutorService executor = Executors.newFixedThreadPool(2);

    public void addThread(Runnable r) {
        executor.submit(r);
    }

    public void finish() {
        try {
            executor.shutdown();
            executor.awaitTermination(50, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {
            Logger.getLogger(ExecutorServiceThreadPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Finished all threads");
    }
}