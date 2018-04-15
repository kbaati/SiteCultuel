package org.site.services;

import java.util.Date;
import java.util.List;

import org.site.metier.InfoProchainPrecheMetier;
import org.site.entities.InfoProchainPreche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoProchainPrecheRestService {

	@Autowired
	private InfoProchainPrecheMetier infoProchainPrecheMetierMetier;
	
	@RequestMapping(value="/infoprochainpreches",method=RequestMethod.POST)
	public InfoProchainPreche saveInfoPreche(InfoProchainPreche info) {
		return infoProchainPrecheMetierMetier.saveInfoPreche(info);
	}

	@RequestMapping(value="/infoprochainpreches",method=RequestMethod.GET)
	public List<InfoProchainPreche> listInfoPreche() {
		return infoProchainPrecheMetierMetier.listInfoPreche();
	}

	@RequestMapping(value="/infoprochainpreches/{d}",method=RequestMethod.GET)
	public InfoProchainPreche getInfoProchainPreche(Date d) {
		return infoProchainPrecheMetierMetier.getInfoProchainPreche(d);
	}
	

}
