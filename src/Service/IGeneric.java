package Service;

import Model.Singer;

import java.util.List;

public interface IGeneric<E>{
    List<Singer> findAll();
    List<Singer> save (E e);

    List<Singer> delete(int id);
    Singer findById(int id);
    List<Singer> sort();
    List<Singer> edit(int id, String name, int age);
}
