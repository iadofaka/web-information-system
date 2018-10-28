package com.cafe.maria.isabel.system.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "cmi_inter_user_application")
public class UserApplication implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", unique= true)
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "is_active")
    private boolean active;
    @Column(name = "date_registry", nullable=false)
    private Timestamp dateRegistry;
    @Column(name = "date_registry_update", nullable=false)
    private Timestamp dateRegistryUpdate;

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Timestamp getDateRegistry() {
        return dateRegistry;
    }

    public void setDateRegistry(Timestamp dateRegistry) {
        this.dateRegistry = dateRegistry;
    }

    public Timestamp getDateRegistryUpdate() {
        return dateRegistryUpdate;
    }

    public void setDateRegistryUpdate(Timestamp dateRegistryUpdate) {
        this.dateRegistryUpdate = dateRegistryUpdate;
    }
}
