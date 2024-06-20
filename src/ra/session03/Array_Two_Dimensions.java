package ra.session03;

import java.util.Scanner;

public class Array_Two_Dimensions {
    public static void main(String[] args) {
        //1. Nhập số dòng (row) và số cột (col) của mảng 2 chiều
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng 2 chiều:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột của mảng 2 chiều:");
        int col = Integer.parseInt(scanner.nextLine());
        //2. Khai báo mảng 2 chiều số nguyên gồm row dòng và col cột
        int[][] numbers = new int[row][col];
        //3. Khai báo và khởi tạo giá trị mảng 2 chiều kiểu float
        float[][] arrFloat = {{5.4F, 8.7F, -3.1F}, {-4.2F, -3.1F, 7}};
        //4. Nhập giá trị các phần tử mảng numbers
        //-Duyệt theo dòng
        for (int i = 0; i < numbers.length; i++) {
            //-Duyệt theo cột
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("numbers[%d][%d]=", i, j);
                numbers[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //5. In giá trị các phân tử trong mảng numbers theo ma trận
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%5d", numbers[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }
}
