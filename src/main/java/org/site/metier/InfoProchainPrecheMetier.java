package org.site.metier;

import java.util.Date;
import java.util.List;

import org.site.entities.InfoProchainPreche;

public interface InfoProchainPrecheMetier {

	/**
	 * 
	 * @param info
	 * @return
	 */
	public InfoProchainPreche saveInfoPreche(InfoProchainPreche info);
	
	/**
	 * 
	 * @return
	 */
	public List<InfoProchainPreche> listInfoPreche();

	/**
	 * 
	 * @param d
	 * @return
	 */
	public InfoProchainPreche getInfoProchainPreche(Date d);
	
}
