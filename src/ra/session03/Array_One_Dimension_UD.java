package ra.session03;

import java.util.Scanner;

public class Array_One_Dimension_UD {
    public static void main(String[] args) {
        /*
         * Nhập số phần tử (n) của mảng và khai báo mảng số nguyên gồm n phần tử
         * In menu và thực hiện các chức năng theo menu:
         *           ****************MENU****************
         *           1. Nhập giá trị các phần tử
         *           2. In giá trị các phần tử
         *           3. Tính tổng các phân tử
         *           4. In các phần tử có giá trị lẻ trong mảng
         *           5. In các phần tử có chỉ số chẵn trong mảng
         *           6. Sắp xếp mảng tăng dần
         *           7. Thoát
         *           Lựa chọn của bạn:
         * */
        //1. Nhập số phần tử và khởi tạo mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[size];
        //2. In menu và thực hiện các chức năng
        do {
            System.out.println("*************MENU*************");
            System.out.println("1. Nhập giá trị các phần tử");
            System.out.println("2. Hiển thị các phần tử");
            System.out.println("3. Tính tổng các phần tử");
            System.out.println("4. Hiển thị các phần tử lẻ");
            System.out.println("5. Hiển thị các phần tử có chỉ số chẵn");
            System.out.println("6. Sắp xếp mảng tăng dần");
            System.out.println("7. Thoát");
            System.out.println("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.printf("numbers[%d]=", i);
                        numbers[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử trong mảng:");
                    for (int element : numbers) {
                        System.out.printf("%d\t", element);
                    }
                    System.out.println();
                    break;
                case 3:
                    int sum = 0;
                    for (int element : numbers) {
                        sum += element;
                    }
                    System.out.println("Tổng các phần tử trong mảng: " + sum);
                    break;
                case 4:
                    System.out.println("Các phần tử lẻ trong mảng:");
                    for (int element : numbers) {
                        if (element % 2 != 0) {
                            System.out.printf("%d\t", element);
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Các phần tử có chỉ số chẵn:");
                    for (int i = 0; i < numbers.length; i++) {
                        if (i % 2 == 0) {
                            System.out.printf("%d\t", numbers[i]);
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    for (int i = 0; i < numbers.length - 1; i++) {
                        for (int j = i + 1; j < numbers.length; j++) {
                            if (numbers[i] > numbers[j]) {
                                //Đổi chỗ phần tử i và j
                                int temp = numbers[i];
                                numbers[i] = numbers[j];
                                numbers[j] = temp;
                            }
                        }
                    }
                    System.out.println("Mảng đã được sắp xếp tăng dần");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-7");
            }
        } while (true);
    }
}
