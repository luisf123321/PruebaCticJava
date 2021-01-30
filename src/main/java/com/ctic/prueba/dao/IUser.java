package com.ctic.prueba.dao;

import com.ctic.prueba.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IUser extends JpaRepository<User,Long> {
    @Query("select u from User u where u.codigo = ?1")
    User buscarCodigo(Long codigo);


}
