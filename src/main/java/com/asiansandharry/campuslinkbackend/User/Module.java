package com.asiansandharry.campuslinkbackend.User;

import jakarta.persistence.*;
@Entity
@Table
public class Module {
    @Id
    private Long moduleId;
    private String moduleName;

    public Module() {}

    public Module(Long moduleId, String moduleName) {
        this.moduleId = moduleId;
        this.moduleName = moduleName;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    @Override
    public String toString() {
        return "Module{" +
                "moduleId=" + moduleId +
                ", moduleName='" + moduleName + '\'' +
                '}';
    }
}
