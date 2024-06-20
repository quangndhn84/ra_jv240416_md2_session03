package ra.session03;

import java.util.Scanner;

public class Array_One_Dimension {
    public static void main(String[] args) {
        //1. Khai báo mảng số nguyên 1 chiều gồm 5 phần tử
        //Syntax: Datatype[] arrayName = new Datatype[size]
        int[] numbers = new int[5];
        //2. Khai báo mảng tên sinh viên gồm 3 sinh viên là: Nguyễn Văn A, Nguyễn Văn B, Nguyễn Văn C
        //Syntax: Datatype[] arrayName = {value1,...,valueN}
        String[] studentNames = {"Nguyễn Văn A", "Nguyễn Văn B", "Nguyễn Văn C"};
        //3. Khởi tạo giá trị các phần tử mảng numbers
        //Truy cập phần tử: arrayName[index]
        numbers[0] = 10;
        numbers[1] = 3;
        numbers[2] = 9;
        numbers[3] = 5;
        numbers[4] = 12;
        //4. In giá trị các phần tử trong mảng studentNames
        //length: lấy số phần tử của mảng (độ dài mảng)
        System.out.println("Giá trị các phần tử mảng tên sinh viên:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.printf("%s\t", studentNames[i]);
        }
        System.out.println();
        /*
            5. Nhập số phần tử của mảng số nguyên (n) và khai báo mảng số nguyên n phần tử
            Nhập giá trị các phần tử của mảng từ bàn phím
            In ra các phần tử có giá trị chẵn trong mảng
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arrInt = new int[n];
        //Nhập giá trị cho các phần tử
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("arrInt[%d]=", i);
            arrInt[i] = Integer.parseInt(scanner.nextLine());
        }
        //In các phần tử chẵn
        System.out.println("Các phần tử chẵn trong mảng là:");
        for (int element : arrInt) {
            if (element % 2 == 0) {
                System.out.printf("%d\t", element);
            }
        }
        System.out.println();
    }
}
