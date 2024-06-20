package ra.exercise;

public class Exerccise_6 {
    public static void main(String[] args) {
        //17???? 2--> 16
        //Hiển thị 20 số nguyên tố đầu tiên (2)
        //B1: Sử dụng vòng while để duyệt và tìm 20 số nguyên tố đầu tiên
        int cntPrime = 0;
        int number = 2;//Kiểm tra number có phải là số nguyên tố không --> in ra
        System.out.println("20 số nguyên tố đầu tiên là:");
        while (cntPrime <= 20) {
            //Kiểm tra số nguyên tố
            boolean isPrime = true;//true: số nguyên tố - false: không phải số nguyên tố
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                cntPrime++;
                System.out.printf("%d\t", number);
            }
            number++;
        }
        System.out.println();
    }
}
