package com.ckw.billSplitter.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "tbl_user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "updated_datetime")
    private Timestamp updatedDatetime;

    @Column(name = "created_datetime")
    private Timestamp createdDatetime;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(name = "tbl_bill_to_user", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "bill_id"))
    private Set<BillModel> userToBill;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Timestamp getUpdatedDatetime() {
        return updatedDatetime;
    }

    public void setUpdatedDatetime(Timestamp updatedDatetime) {
        this.updatedDatetime = updatedDatetime;
    }

    public Timestamp getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Timestamp createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public Set<BillModel> getUserToBill() {
        return userToBill;
    }

    public void setUserToBill(Set<BillModel> userToBill) {
        this.userToBill = userToBill;
    }
}
