package com.pratyay.repository;

import com.pratyay.model.Project;
import com.pratyay.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

//    List<Project>findByOwner(User user); //list of project created by user

    List<Project>findByNameContainingAndTeamContains(String partialName, User user); //Search project by name

//    @Query("SELECT p From Project p join p.team t where t=:user")
//    List<Project>findProjectBYTeam(@Param("user") User user);

//    @Query("SELECT p FROM Project p LEFT JOIN p.team t WHERE p.owner.id = :userId OR t.id = :userId")
//    List<Project> findProjectsByUserId(@Param("userId") Long userId);

    List<Project> findByTeamContainingOrOwner(User user, User owner);
}
