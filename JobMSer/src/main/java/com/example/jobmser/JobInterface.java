package com.example.jobmser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JobInterface extends JpaRepository<Job, Integer> {
    @Query("SELECT j FROM Job j WHERE j.id = :id OR j.service = :service")
    Job getJobByIdOrName(@Param("id") int id, @Param("service") String service);

    @Modifying
    @Query("UPDATE Job j SET j.etat = true WHERE j.id = :id")
    void changeStateToTrue(@Param("id") int id);

    @Modifying
    @Query("UPDATE Job j SET j.etat = false WHERE j.id = :id")
    void changeStateToFalse(@Param("id") int id);
}
