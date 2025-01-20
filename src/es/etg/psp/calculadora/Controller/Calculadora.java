package es.etg.psp.calculadora.Controller;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Calculadora implements Calculable{
    private final ReadWriteLock lock=new ReentrantReadWriteLock();
    private final Lock w=lock.writeLock();
}
