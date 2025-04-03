package com.asiansandharry.campuslinkbackend.dbTables;

import jakarta.persistence.*;

@Entity
@Table
public class Module {
    @Id
    private long ModuleId;
    private String ModuleName;
    private String ModuleDescription;

    public Module() {}

    public Module(long ModuleId, String ModuleName, String ModuleDescription) {
        this.ModuleId = ModuleId;
        this.ModuleName = ModuleName;
        this.ModuleDescription = ModuleDescription;
    }

    public long getModuleId() {
        return ModuleId;
    }

    public void setModuleId(long moduleId) {
        ModuleId = moduleId;
    }

    public String getModuleName() {
        return ModuleName;
    }

    public void setModuleName(String moduleName) {
        ModuleName = moduleName;
    }

    public String getModuleDescription() {
        return ModuleDescription;
    }

    public void setModuleDescription(String moduleDescription) {
        ModuleDescription = moduleDescription;
    }

    @Override
    public String toString() {
        return "Module{" +
                "ModuleID=" + ModuleId +
                ", ModuleName='" + ModuleName + '\'' +
                ", ModuleDescription='" + ModuleDescription + '\'' +
                '}';
    }
}
