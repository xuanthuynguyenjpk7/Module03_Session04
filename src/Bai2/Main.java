package Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        int n = sc.nextInt();

        //Khởi Tạo Mảng có kích thước là n phần tử
        int[] arr = new int[n];
        //Người dùng nhập từng giá trị cho mảng số nguyên. Dùng vòng lặp for
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        //Tính Tổng:
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print("Tổng các phần tử trong mảng là: " + sum);
        sc.close();
    }
}
