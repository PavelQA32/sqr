package ru.netology.sqr;


public class FindSqr {
    public static void main(String[] args) {

        SQRService service = new SQRService();

        int number = service.calculate(400,200);

        System.out.println(number);
    }
}