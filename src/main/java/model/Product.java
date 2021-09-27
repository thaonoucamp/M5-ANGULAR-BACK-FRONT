package model;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    private Category category;
    private String img;
    private String price;
    private boolean status;
}
