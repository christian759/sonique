package com.csphere.sonique.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Listener extends Customer{
    private String favoriteGenre;
    private String country;
}
