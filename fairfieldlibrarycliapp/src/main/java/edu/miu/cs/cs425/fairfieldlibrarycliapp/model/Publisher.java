package edu.miu.cs.cs425.fairfieldlibrarycliapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "publishers")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer publisherId;
    @Column(name = "publisher_name", nullable = false)
    @NotNull(message = "Publisher Name cannot be null")
    @NotEmpty(message = "Publisher Name cannot be empty")// name = "";
    @NotBlank(message = "Publisher Name cannot be blank spaces")// name="   "
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="primary_addr_id", nullable = true)
    private PrimaryAddress primaryAddress;

    @Override
    public String toString() {
        return String.format("{PublisherID: %d, PublisherName: %s, PrimaryAddr: %s}\n",
                publisherId, name, primaryAddress);
    }
}
