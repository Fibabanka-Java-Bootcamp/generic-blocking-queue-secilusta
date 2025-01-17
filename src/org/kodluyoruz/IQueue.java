package org.kodluyoruz;

public interface IQueue<T> {
    public void Add(T value);
    public T Poll();
    public T Peek();
}
