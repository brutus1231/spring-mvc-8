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
    private String fistName;

    @Column
    private String lastName;

    @Column
    private Integer age;
}
