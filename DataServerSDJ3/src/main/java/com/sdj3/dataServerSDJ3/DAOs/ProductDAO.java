package com.sdj3.dataServerSDJ3.DAOs;

import com.sdj3.dataServerSDJ3.share.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends JpaRepository<Product,Integer> {
    @Query(value = """
            select pr.id,pr.name,pr.weight
            from product pr join part p on pr.id = p.product_id join animal a on a.id = p.animal_id
            where animal_id =?1  group by pr.id""",nativeQuery = true)
    List<Product> getAllProductsFromAnimal(int animalId);

}
