package edu.miu.cs.cs425.fairfieldlibrarycliapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="primary_addresses")
public class PrimaryAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    @OneToOne(mappedBy = "primaryAddress")
    private Publisher publisher;

    @Override
    public String toString() {
        return String.format("{AddressId: %d, Street: %s, City: %s, State: %s, ZipCode: %s}"
                , addressId, street, city, state, zipCode);
    }
}
