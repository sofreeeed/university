package ru.mirea.practice5.lab24.task2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicanChair createMagic();
    FunctionalChair createFunctuionalChair();
}
