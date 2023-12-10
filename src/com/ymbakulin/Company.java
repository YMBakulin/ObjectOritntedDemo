package com.ymbakulin;

import java.util.Objects;

public class Company {

    Integer id;
    String name;
    String address;
    Long phoneNumber;

    public Company(Integer id, String name, String address, Long phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    void showCompanyInfo(Integer id) {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return Objects.equals(id, company.id) && Objects.equals(name, company.name) && Objects.equals(address, company.address) && Objects.equals(phoneNumber, company.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, phoneNumber);
    }
}
