package com.app.marjane_backend.repositories;


import com.app.marjane_backend.entities.CenterAdministrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterAdministratorRepository extends JpaRepository<CenterAdministrator, Long> {


}
