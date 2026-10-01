package com.mariem.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohamed.produits.entities.produit;

public interface ProduitRepository extends JpaRepository<produit, Long> {

}
