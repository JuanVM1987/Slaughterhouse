package com.sdj3.dataServerSDJ3.DAOs;

import com.sdj3.dataServerSDJ3.share.entity.Tray;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrayDAO extends JpaRepository<Tray,Integer> {


}
