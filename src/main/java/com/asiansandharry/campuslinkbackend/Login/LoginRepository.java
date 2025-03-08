package com.asiansandharry.campuslinkbackend.Login;

import com.asiansandharry.campuslinkbackend.dbTables.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


//This interface deals with data access from the database
@Repository
public interface LoginRepository extends JpaRepository<Account, Long> { //Passes in the account class and interger since that's its primary key (@Id)

    @Query("SELECT s FROM Account s WHERE s.Email = :email")
    Optional<Account> findByEmail(String email);

}
