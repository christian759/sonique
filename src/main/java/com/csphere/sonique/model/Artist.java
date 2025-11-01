package com.csphere.sonique.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Artist extends Customer{
    private String stageName;
    private String genre;
}
