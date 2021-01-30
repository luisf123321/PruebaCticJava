package com.ctic.prueba.dao;

import com.ctic.prueba.models.Parqueadero;
import com.ctic.prueba.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IParq extends JpaRepository<Parqueadero,Integer> {

    @Query("select count(*) from Parqueadero u where u.estado = 'Libre'")
    int totalPar();
    @Query("select count(*) from Parqueadero u where u.estado = 'ocupado'")
    int totalParOc();
    @Query("select u from Parqueadero u where u.estado = 'Libre'")
    List<Parqueadero> totalLib();

}
