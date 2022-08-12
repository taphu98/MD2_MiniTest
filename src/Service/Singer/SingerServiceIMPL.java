package Service.Singer;

import Model.Singer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingerServiceIMPL implements ISingerService {
    public static List<Singer> singerList = new ArrayList<>();

    static {
        singerList.add(new Singer(1, "Tuấn Hưng", 27));
        singerList.add(new Singer(2, "Mỹ Tâm", 25));
        singerList.add(new Singer(3, "Sơn Tùng", 26));
    }
    @Override
    public List<Singer> sort() {
        Collections.sort(singerList);
        updateId();
        return singerList;
    }

    @Override
    public List<Singer> findAll() {
        return singerList;
    }

    @Override
    public List<Singer> save(Singer singer) {
        singerList.add(singer);

        return singerList;
    }


    @Override
    public List<Singer> edit(int id, String name, int age) {
        singerList.get(id - 1).setName(name);
        singerList.get(id - 1).setAge(age);
        return singerList;
    }


    //    @Override
//    public void deleteById(Singer singer) {
//        singerList.remove(singer);
//    }

    @Override
    public List<Singer> delete(int id) {
        singerList.remove(id -1);
        updateId();
        return singerList;
    }

    @Override
    public Singer findById(int id) {
        return singerList.get(id);
    }
    public void updateId(){
        for (int i = 0; i < singerList.size(); i++) {
            singerList.get(i).setId(i+1);
        }
    }


}


