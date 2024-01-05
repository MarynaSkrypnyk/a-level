package org.example;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@ToString(exclude = "user")
@Table(name ="booking")

public class Booking {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String bookingText;

        @ManyToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "user_id")
        private User user;

        @Column(name = "booking_time")
        private LocalDateTime bookingTime;
}
