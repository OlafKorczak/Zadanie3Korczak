package Zadanie3Korczak;

public class Zadanie3Korczak {
    public static void main(String[] args) {
        int maxKorczak = 100;
        int minKorczak = 1;
        int rangeKorczak = maxKorczak - minKorczak + 1;
        int aKorczak = (int)(Math.random() * rangeKorczak)+ minKorczak;
        System.out.println(aKorczak);
        if(aKorczak%2 == 0)
            System.out.println("Liczba jest parzysta");
        else
            System.out.println("Liczba jest nieparzysta");
    }
}
