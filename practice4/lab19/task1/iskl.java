package ru.mirea.practice4.lab19.task1;

public class iskl{
    private String[] inn = new String[]{"123456789123", "987654321987"};

    public void getInn(String key) throws InnException {
        boolean found = false;
        for (int i = 0; i < inn.length; i++) {
            if (key.equals(inn[i])) {
                found = true;
                break;
            }
        }
        if (!found) {
            throw new InnException("key don't equals in Inn");
        }else System.out.println("все ок");
    }
    public static class InnException extends RuntimeException {
        public InnException(String errorMessage) {
            super(errorMessage);
        }
    }
}
