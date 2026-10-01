package com.mariem.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mohamed.produits.entities.produit;
import com.mohamed.produits.repos.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	@Test
	public void testCreateProduit() {
	produit prod = new produit("PC Asus",1500.500, new Date());
	produitRepository. save(prod);
	}

	
	@Test
	public void testFindProduit() {

	produit p = produitRepository.findById(1L).get();
	System.out.println(p);
	}
	
	@Test
	public void testUpdateProduit(){
	produit p = produitRepository.findById(1L).get();
	p.setPrixProduit(2000.0);
	produitRepository. save(p);
	
	System.out.println(p);
	}
	
	@Test
	public void testDeleteProduit()
	{

	produitRepository.deleteById(1L);
	}
	
	@Test
	public void testFindAllProduits() {

	List<produit> prods = produitRepository.findAll();

	for (produit p:prods)
	System.out.println(p);

	}
	
	
}

	
