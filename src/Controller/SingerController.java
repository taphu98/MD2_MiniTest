package Controller;

import Model.Singer;
import Service.Singer.ISingerService;
import Service.Singer.SingerServiceIMPL;

import java.util.List;

public class SingerController {
    ISingerService singerService = new SingerServiceIMPL();

    public List<Singer> getSingerList() {
        return SingerServiceIMPL.singerList;
    }

    public List<Singer> createSinger(String name, int age) {
        return singerService.save(new Singer(getSingerList().size() + 1, name, age));
    }

    public List<Singer> editSinger(int id, String name, int age) {
        return singerService.edit(id, name, age);
    }

    public List<Singer> deleteSinger(int id) {
        return singerService.delete(id );

    }

    public Singer findSinger(int id) {
        return singerService.findById(id);

    }
    public List<Singer> sortByName(){
        return singerService.sort();
    }

    

}
