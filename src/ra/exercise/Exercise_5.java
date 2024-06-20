package ra.exercise;

public class Exercise_5 {
    public static void main(String[] args) {
        //Hiển thị các số nguyên tố nhỏ hơn 100
        System.out.println("Các số nguyên tố nhỏ hơn 100:");
        for (int i = 2; i < 100; i++) {
            //Kiểm tra i có phải là số nguyên tố không?
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%d\t", i);
            }
        }
    }
}
