package com.sdj3.dataServerSDJ3.DAOs;

import com.sdj3.dataServerSDJ3.share.entity.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartDAO extends JpaRepository<Part,Integer> {

}
