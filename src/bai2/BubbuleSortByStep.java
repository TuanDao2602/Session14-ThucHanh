package bai2;

import java.util.Scanner;

public class BubbuleSortByStep {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào độ dài của mảng");
        int size =Integer.parseInt(scanner.nextLine());
        int[]list =new int[size];
        System.out.println("nhập vào mảng số nguyên");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();

        }
        System.out.println("Mảng sau khi nhập là");
        for (Integer number: list) {
            System.out.print(number + "\t");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);

    }
    public static void bubbleSortByStep(int[] list){
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length-k; i++) {
                if (list[i]>list[i+1]){
                    System.out.println("tráo đổi " + list[i] + " với " + list[i + 1]);
                    int temp= list[i];
                    list[i] =list[i+1];
                    list[i+1]=temp;
                    needNextPass=true;
                }

            }
            if (needNextPass == false) {
                System.out.println("Mảng đã được sắp xếp");
                break;
            }
            System.out.print("mảng sắp xếp lần  " + k + " sort: ");
            for  (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
