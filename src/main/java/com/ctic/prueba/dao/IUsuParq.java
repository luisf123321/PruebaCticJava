package com.ctic.prueba.dao;

import com.ctic.prueba.models.Parqueadero;
import com.ctic.prueba.models.UserParq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IUsuParq extends JpaRepository<UserParq,Integer> {

    @Query("select u from UserParq u where u.estado='Ingreso'")
    List<UserParq> datato();


}
