package com.samisezgin.springsecurityjwt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
