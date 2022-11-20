package com.sdj3.dataServerSDJ3.DAOs;

import com.sdj3.dataServerSDJ3.share.entity.Tray;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;




@Repository

public interface TrayDAO extends JpaRepository<Tray,Integer> {
    @Query(value = """
            SELECT SUM(weight)
            FROM part\s
            WHERE tray_id = ?1 and product_id is null""", nativeQuery = true)
    Double getActualWeight(int trayId);

}
