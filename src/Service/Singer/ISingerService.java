package Service.Singer;

import Model.Singer;
import Service.IGeneric;

import java.util.List;

public interface ISingerService extends IGeneric<Singer> {

    List<Singer> edit(int id, String name, int age);


}
