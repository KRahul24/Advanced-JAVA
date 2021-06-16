package com.cybage.model;

import java.io.InputStream;
import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;


	@Entity
	@Table(name = "Users")
	public class User implements Serializable{
		
		private static final long serialVersionUID = 1L;
		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column(name = "category")
	    private String category;

	    @Column(name = "material")
	    private InputStream material;
	    
	    public  User() {
	    	
	    }
	    
	    public User(int id, String category, InputStream material) {
			super();
			this.id = id;
			this.category = category;
			this.material = material;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public InputStream getMaterial() {
			return material;
		}

		public void setMaterial(InputStream material) {
			this.material = material;
		}

		
	   
}
