package com.example.springjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springjpa.model.UserGroup;

/**
 * @author nageswara.eluri
 *
 */
@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup, Long>{

}
