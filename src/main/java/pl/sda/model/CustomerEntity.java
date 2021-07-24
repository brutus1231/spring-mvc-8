package pl.sda.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerEntity {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private Integer age;
}
