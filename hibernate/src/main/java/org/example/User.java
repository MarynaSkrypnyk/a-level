package org.example;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table (name = "user",schema = "public")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name",length = 65)
    private String firstname;

    @Column(name = "last_name",length = 65)
    private String lastname;

    @Setter
    @Getter
    @OneToMany
    private List <Booking> bookings = new ArrayList<>();
}
