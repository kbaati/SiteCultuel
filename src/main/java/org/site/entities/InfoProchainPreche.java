package org.site.entities;
/*******************************************************************************
 description

* 2018, All rights reserved.
 *******************************************************************************/

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Description of InfoProchainPreche.
 * 
 * @author baati
 */
@Entity
public class InfoProchainPreche implements Serializable {

	/**
	 * Description of the property datePreche.
	 */
	@Id
	private String datePreche;
	
	/**
	 * Description of the property nomImam.
	 */
	private String nomImam;

	/**
	 * Description of the property themePreche.
	 */
	private String themePreche;


	/**
	 * The constructor.
	 */
	public InfoProchainPreche() {
		// Start of user code constructor for InfoProchainPreche)
		super();
		// End of user code
	}

	public InfoProchainPreche(String datePreche) {
		super();
		this.datePreche = datePreche;
	}

	public InfoProchainPreche(String datePreche, String nomImam, String themePreche) {
		super();
		this.datePreche = datePreche;
		this.nomImam = nomImam;
		this.themePreche = themePreche;
	}


	// Start of user code (user defined methods for InfoProchainPreche)

	// End of user code
	/**
	 * Returns nomImam.
	 * @return nomImam 
	 */
	public String getNomImam() {
		return this.nomImam;
	}

	/**
	 * Sets a value to attribute nomImam. 
	 * @param newNomImam 
	 */
	public void setNomImam(String newNomImam) {
		this.nomImam = newNomImam;
	}

	/**
	 * Returns datePreche.
	 * @return datePreche 
	 */
	public String getDatePreche() {
		return this.datePreche;
	}

	/**
	 * Sets a value to attribute datePreche. 
	 * @param newDatePreche 
	 */
	public void setDatePreche(String newDatePreche) {
		this.datePreche = newDatePreche;
	}

	/**
	 * Returns themePreche.
	 * @return themePreche 
	 */
	public String getThemePreche() {
		return this.themePreche;
	}

	/**
	 * Sets a value to attribute themePreche. 
	 * @param newThemePreche 
	 */
	public void setThemePreche(String newThemePreche) {
		this.themePreche = newThemePreche;
	}

}
