package ru.kulakov._1_2_spring_boot.model;

import jakarta.persistence.*;
import lombok.*;



@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private String city;

    public User(String username, Integer age, String city) {
        this.username = username;
        this.age = age;
        this.city = city;
    }


}
