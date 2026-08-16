package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử
        int n;

        do {
            System.out.print("Nhập số phần tử của mảng: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Số phần tử phải lớn hơn 0!");
            }

        } while (n <= 0);

        // Khởi tạo mảng
        int[] arr = new int[n];

        // Nhập mảng
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        // Selection Sort giảm dần
        for (int i = 0; i < n - 1; i++) {

            int max = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] > arr[max]) {
                    max = j;
                }

            }

            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

        // In mảng đã sắp xếp
        System.out.println("\nMảng sau khi sắp xếp giảm dần:");

        for (int value : arr) {
            System.out.print(value + " ");
        }

        // Phần tử lớn nhất
        System.out.println("\nPhần tử lớn nhất trong mảng là: " + arr[0]);

        sc.close();
    }
}
