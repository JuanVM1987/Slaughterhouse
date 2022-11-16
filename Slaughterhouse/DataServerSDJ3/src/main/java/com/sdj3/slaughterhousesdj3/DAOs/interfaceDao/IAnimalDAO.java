package com.sdj3.slaughterhousesdj3.DAOs.interfaceDao;




import com.sdj3.slaughterhousesdj3.Model.Animal;
import com.sdj3.slaughterhousesdj3.Model.Product;

import java.util.List;

public interface IAnimalDAO {
    List<Animal> getAnimalFromProduct(Product product);
    List<Animal> getAllAnimals();
    Animal getAnimalById(int id);
    Animal RegisterAnima(Animal animal);

}
