package ru.mirea.practice5.lab24.task1;

public class ConcreteFactory implements ComlexAbstractFactory{

    public ConcreteFactory(){}

    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex(real,image);
    }

    public Complex createComplex(){
        return new Complex();
    }
}
