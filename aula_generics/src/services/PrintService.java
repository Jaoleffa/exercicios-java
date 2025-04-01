package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    protected List<T> conjuntoNumeros = new ArrayList<>();

    public void addValue(T value) {
        conjuntoNumeros.add(value);
    }

    public T first() {
        if(conjuntoNumeros.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return conjuntoNumeros.get(0);
    }

    public void print() {
        for (int i = 0; i < conjuntoNumeros.size(); i++) {
            System.out.println(conjuntoNumeros.get(i));
        }
    }
}
