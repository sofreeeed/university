package ru.mirea.practice5.lab24.task3;

public class TextDocument implements IDocument {

    public TextDocument(){}

    @Override
    public void Open() {
        System.out.println("файл сохранен");
    }

    @Override
    public void Exit() {
        System.out.println("файл закрыт");
    }
}
