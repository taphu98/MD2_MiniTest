package View;

import Controller.SingerController;
import Model.Singer;
import Service.Singer.SingerServiceIMPL;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.List;
import java.util.Scanner;

public class Main {
    public Main(){
        Scanner scanner = new Scanner(System.in);
        List<Singer> singerList = new SingerController().getSingerList();
        int choice = -1;
        while (choice != 7) {
            System.out.println("Menu");
            System.out.println("1. Show List Singer");
            System.out.println("2. Create Singer");
            System.out.println("3. Update Singer");
            System.out.println("4. Detail Singer");
            System.out.println("5. Delete Singer");
            System.out.println("6. Sort Singer List");
            System.out.println("0. Exit");

            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.println("SHOW LIST SINGER");
                    new SingerView().viewSinger();
                    break;
                case 2:
                    System.out.println("CREATE SINGER");
                    new SingerView().creatProduct();
                    break;
                case 3:
                    System.out.println("EDIT SINGER");
                    new SingerView().editProduct();break;
                case 4:
                    System.out.println("SEARCH SINGER");
                    new SingerView().findSinger();break;
                case 5:
                    System.out.println("DELETE SINGER");
                    new SingerView().deleteSinger();
                    break;
                case 6:
                    System.out.println("SORT SINGER");
                        new SingerView().sortByName();
                        break;
                case 0:
                    return;
                default:
                    System.out.println("WRONG. TRY AGAIN");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }

}
