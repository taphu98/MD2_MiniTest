package View;

import Controller.SingerController;
import Model.Singer;

import java.util.List;
import java.util.Scanner;

public class SingerView {
    Scanner sc = new Scanner(System.in);
    SingerController singerController = new SingerController();

    public void viewSinger() {
        System.out.println("------ID-------NAME-------AGE");
        List<Singer> singerList = singerController.getSingerList();
        for (int i = 0; i < singerList.size(); i++) {
            System.out.println("------" + singerList.get(i).getId() +
                    " ------ " + singerList.get(i).getName() + "------"
                    + singerList.get(i).getAge() + "-------");
        }
        System.out.println("Enter 'back' to return ");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }

    public void creatProduct() {
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());
        List<Singer> singerList = singerController.createSinger(name, age);
        System.out.println("------ID------NAME------AGE------");
        for (int i = 0; i < singerList.size(); i++) {
            System.out.println("------ " + singerList.get(i).getId() + " ------ " + singerList.get(i).getName() + " ------ " + singerList.get(i).getAge() + "-------");
        }
        System.out.println("Add success");
        System.out.println("Enter 'back' to return ");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }

    public void editProduct() {
        System.out.println("Enter id want edit: ");
        int idEdit = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name want edit");
        String nameEdit = sc.nextLine();
        System.out.println("Enter age want edit: ");
        int ageEdit = Integer.parseInt(sc.nextLine());

        List<Singer> singerList = singerController.editSinger(idEdit, nameEdit, ageEdit);
        System.out.println("------ID------NAME------AGE------");
        for (int i = 0; i < singerList.size(); i++) {
            System.out.println("------ " + singerList.get(i).getId() + " ------ " + singerList.get(i).getName() + " ------ " + singerList.get(i).getAge() + "-------");
        }
        System.out.println("Enter 'back' to return ");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }

    public void deleteSinger() {
        System.out.println("Enter id want remove: ");
        int idDelete = Integer.parseInt(sc.nextLine());
        if (!isValid(idDelete)){
            System.out.println("Id is out of range");
            return;
        }
        System.out.println("CHOOSE YES OR NO(Y/N)");
        String check = sc.nextLine();
        if (check.equalsIgnoreCase("y")){
            singerController.deleteSinger(idDelete);
        } else if (check.equalsIgnoreCase("n")){
            System.out.println("DO NOT DELETE");
        }else {
            System.out.println("INVALID CHOICE");
        }

        List<Singer> singerList = singerController.getSingerList();
        System.out.println("------STT------PRICE------NAME------");
        for (int i = 0; i < singerList.size(); i++) {
            System.out.println("------ " + singerList.get(i).getId() + " ------ " + singerList.get(i).getName() + " ------ " + singerList.get(i).getAge() + "-------");
        }
    }
    public void findSinger(){
        System.out.println("Enter id want search: ");
        int id = Integer.parseInt(sc.nextLine());
        Singer singer = singerController.findSinger(id-1);
        System.out.println("ID : "+ singer.getId() +", name : " +singer.getName() + ", age : " + singer.getAge());
    }
    public void sortByName(){
        System.out.println("------ID------NAME------AGE------");
        List<Singer> singerList = singerController.sortByName();
        for (int i=0 ; i< singerList.size(); i++){
            System.out.println("------ " + singerList.get(i).getId() + " ------ " + singerList.get(i).getName() + " ------ " + singerList.get(i).getAge() + "-------" );
        }
        System.out.println("Enter 'back' return");
        String back = sc.nextLine();
        if (back.equalsIgnoreCase("back")){
            new Main();
        }
    }
    private boolean isValid(int id){
        int size = singerController.getSingerList().size();
        return id >= 0 && id < size;
    }
}