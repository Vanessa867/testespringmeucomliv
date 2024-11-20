package com.comlivteste.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryModel {
    @Id
    @GeneratedValue
    private Long id;
    private String nameCategory;
    @OneToMany(mappedBy = "categoryModel")
    private List<ClubsModel> Club;
}
