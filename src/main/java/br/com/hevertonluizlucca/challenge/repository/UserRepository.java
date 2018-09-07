package br.com.hevertonluizlucca.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.hevertonluizlucca.challenge.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByName(String name);
	
	@Query(value = "select * from User usr where (usr.name LIKE CONCAT('%',:filter,'%') or usr.username LIKE CONCAT('%',:filter,'%') or usr.email LIKE CONCAT('%',:filter,'%')) ", nativeQuery = true)
	List<User> findbyFilterParam(@Param("filter") String filter);
	
}
