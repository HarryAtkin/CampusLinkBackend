package com.asiansandharry.campuslinkbackend.Login;

import com.asiansandharry.campuslinkbackend.User.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


//This interface deals with data access from the database
@Repository
public interface LoginRepository extends JpaRepository<Account, Integer> { //Passes in the account class and interger since that's its primary key (@Id)

    @Query("SELECT s.AccountID FROM Account s WHERE s.Email = s.Email")
    Optional<Account> findByEmail(String Email);

}
