package com.sdj3.dataServerSDJ3.DAOs;


import com.sdj3.dataServerSDJ3.share.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalDAO extends JpaRepository<Animal,Integer> {

    @Query(value = "select a.id, a.arrived_date, a.origen, a.weight from animal a " +
            "join part p on a.id = p.animal_id " +
            "join product p2 on p2.id = p.product_id where p.product_id=?1" +
            " group by a.id",nativeQuery = true)
    List<Animal> getAnimalFromProduct(int productId);
}
