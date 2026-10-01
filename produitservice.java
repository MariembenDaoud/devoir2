package com.mohamed.produits.service;

import java.util.List;

import com.mariem.produits.entities.produit;

public interface produitservice {
	produit saveProduit(produit p);
	produit updateProduit(produit p);
	void deleteProduit(produit p);
	void deleteProduitById(Long id);
	produit getProduit(Long id);
	List<produit> getAllProduits();
}
