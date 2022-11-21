package com.sdj3.dataServerSDJ3.DAOs;

import com.sdj3.dataServerSDJ3.share.entity.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartDAO extends JpaRepository<Part,Integer> {
    @Query(value = """
            select *
            from part
            where tray_id =?1 and product_id is null""",nativeQuery = true)
    List<Part> getAllPartsInTray(int partId);

    @Query(value = """
            select *
            from part
            where id =1 and product_id is null""",nativeQuery = true)
    Part getPartIntTray(int partId);
}
