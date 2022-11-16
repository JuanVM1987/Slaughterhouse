package com.sdj3.slaughterhousesdj3.DAOs.interfaceDao;

import com.sdj3.slaughterhousesdj3.Model.Animal;
import com.sdj3.slaughterhousesdj3.Model.Product;


import java.util.List;

public interface IProductDAO {

    List<Product> allProductComingFromSameAnimal(Animal animal);

}
