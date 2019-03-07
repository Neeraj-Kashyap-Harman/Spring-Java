package com.bootjpa.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import com.bootjpa.demo.model.Alien;

/*JPA Repositor extends */
public interface AlienRepo extends JpaRepository<Alien, Integer> {
	
	
	
	/*
	 * List<Alien> findByTech(String tech); List<Alien> findByAidGreaterThan(int
	 * aid);
	 * 
	 * For writing Query in JPA
	 * 
	 * @Query("from Alien where tech=?1 order by aname") List<Alien>
	 * findByTechSorted(String tech);
	 */

}
