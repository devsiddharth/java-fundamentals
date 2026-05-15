package oop.collections;

import java.util.Objects;

public class Customer implements Comparable<Customer>{
    public int id;
    public String name;
    public String email;

    Customer(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        //  return Integer.compare(o.id, id);
        return this.name.compareTo(o.name);
    }
}