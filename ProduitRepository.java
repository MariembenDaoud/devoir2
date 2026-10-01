package com.mariem.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariem.produits.entities.produit;

public interface ProduitRepository extends JpaRepository<produit, Long> {

}
