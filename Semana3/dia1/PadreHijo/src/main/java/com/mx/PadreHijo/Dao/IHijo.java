package com.mx.PadreHijo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.mx.PadreHijo.Dominio.*;

@Repository
public interface IHijo extends JpaRepository<Hijo,Integer>{
	
	 @Query(value = "SELECT * FROM HIJO H WHERE UPPER(H.HOBBIE) = UPPER(:hobbie)",
			 nativeQuery = true)
	 public List<Hijo> findByHobbie(String hobbie);

}
