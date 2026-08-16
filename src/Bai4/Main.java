package Bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Nhập kích thước của mảng: ");
        int n = sc.nextInt();

        // Kiểm tra kích thước rỗng
        if (n == 0) {
            System.out.println("Kích thước rỗng");
            sc.close();
            return;
        }

        // Tạo mảng
        int[] arr = new int[n];

        // Nhập các phần tử
        System.out.println("Nhập các phần tử cho mảng:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Hiển thị mảng ban đầu
        System.out.print("Mảng ban đầu: [");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        // Đảo ngược mảng
        int temp;

        for (int i = 0; i < n / 2; i++) {

            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        // Hiển thị mảng sau khi đảo ngược
        System.out.print("Mảng sau khi đảo ngược: [");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        sc.close();
    }
}