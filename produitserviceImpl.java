package com.mariem.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariem.produits.entities.produit;
import com.mariem.produits.repos.ProduitRepository;

@Service
public class produitserviceImpl implements produitservice {
	
	
	@Autowired
	ProduitRepository produitRepository;

	@Override
	public produit saveProduit(produit p) {

		return ProduitRepository.save(p);
	}

	@Override
	public produit updateProduit(produit p) {
		return ProduitRepository.save(p);	}

	@Override
	public void deleteProduit(produit p) {
		ProduitRepository.delete(p);
	}

	@Override
	public void deleteProduitById(Long id) {
		ProduitRepository.deleteById(id);
	}

	@Override
	public produit getProduit(Long id) {
		return ProduitRepository.findById(id).get() ;
	}

	@Override
	public List<produit> getAllProduits() {
		return ProduitRepository.findAll();
	}

}
