package com.sdj3.dataServerSDJ3.DAOs;




import com.sdj3.dataServerSDJ3.share.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
@Repository
public interface AnimalDAO extends JpaRepository<Animal,Integer> {


}
