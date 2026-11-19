package ru.mirea.practice5.lab24.task3;

public class TextCreateDocument implements ICreateDocument{

    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        return new TextDocument();
    }
}
