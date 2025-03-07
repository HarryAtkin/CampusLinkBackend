package com.asiansandharry.campuslinkbackend.dbTables;

import jakarta.persistence.*;

@Entity
@Table
public class University {
    @Id
    private Long UniversityID;
    private String UniversityName;
    private String UniversityAddress;

    public University() {}

    public University(Long UniversityID, String UniversityName, String UniversityAddress) {
        this.UniversityID = UniversityID;
        this.UniversityName = UniversityName;
        this.UniversityAddress = UniversityAddress;
    }

    public Long getUniversityID() {
        return UniversityID;
    }

    public void setUniversityID(Long universityID) {
        UniversityID = universityID;
    }

    public String getUniversityName() {
        return UniversityName;
    }

    public void setUniversityName(String universityName) {
        UniversityName = universityName;
    }

    public String getUniversityAddress() {
        return UniversityAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        UniversityAddress = universityAddress;
    }

    @Override
    public String toString() {
        return "University{" +
                "UniversityID=" + UniversityID +
                ", UniversityName='" + UniversityName + '\'' +
                ", UniversityAddress='" + UniversityAddress + '\'' +
                '}';
    }
}
