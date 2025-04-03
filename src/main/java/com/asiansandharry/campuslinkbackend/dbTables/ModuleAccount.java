package com.asiansandharry.campuslinkbackend.dbTables;

import jakarta.persistence.*;

@Entity
@Table
public class ModuleAccount {

    /* Junction table between Module and Accounts*/

    /* Composite Primary Key ModuleID & AccountID*/
    @Id
    /* Foreign Key from Module table */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "ModuleId")
    private Module Module;
    /* Foreign Key from Account table */
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "accountid")
    private Account Account;

    public ModuleAccount() {}

    public ModuleAccount(Module Module, Account Account) {
        this.Module = Module;
        this.Account = Account;
    }

    public Module getModule() {
        return Module;
    }

    public void setModule(Module module) {
        Module = module;
    }

    public Account getAccount() {
        return Account;
    }

    public void setAccount(Account account) {
        Account = account;
    }

    @Override
    public String toString() {
        return "ModuleAccounts{" +
                "Module=" + Module +
                ", Account ='" + Account + '\'' +
                '}';
    }
}
