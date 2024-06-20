package ra.exercise;

import java.util.Scanner;

public class UCLN_BCNN {
    public static void main(String[] args) {
        //UCLN: a - b: a==b?
        //UCLN: 15 20: 15 5 : 10 5 : 5 5
        //BCNN: (a*b)/UCLN
        //Nhập 2 số a-b, in ra ước chung lớn nhất và bội chung nhỏ nhất của 2 số
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên thứ nhất:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số nguyên thứ hai:");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        //Tìm ước chung lớn nhất
        int a = firstNumber, b = secondNumber;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.printf("Ước chung lớn nhất của %d và %d là %d\n", firstNumber, secondNumber, a);
        System.out.printf("Bội chung nhỏ nhất của %d và %d là %d\n", firstNumber, secondNumber, (firstNumber * secondNumber) / a);
    }
}
