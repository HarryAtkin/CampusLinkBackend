package com.asiansandharry.campuslinkbackend.dbTables;

import jakarta.persistence.*;

@Entity
@Table
public class ModuleAccount {

    /* Junction table between Module and Accounts*/

    /* Composite Primary Key ModuleID & AccountID*/
    @Id
    /* Foreign Key from Module table */
    private long ModuleID;
    /* Foreign Key from Account table */
    private long AccountID;

    public ModuleAccount() {}

    public ModuleAccount(long ModuleID, long AccountID) {
        this.ModuleID = ModuleID;
        this.AccountID = AccountID;
    }

    public long getModuleID() {
        return ModuleID;
    }

    public void setModuleID(long moduleID) {
        ModuleID = moduleID;
    }

    public long getAccountID() {
        return AccountID;
    }

    public void setAccountID(long accountID) {
        AccountID = accountID;
    }

    @Override
    public String toString() {
        return "ModuleAccounts{" +
                "ModuleID=" + ModuleID +
                ", AccountID ='" + AccountID + '\'' +
                '}';
    }
}
