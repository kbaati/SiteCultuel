package org.site.metier;

import java.util.Date;
import java.util.List;

import org.site.dao.InfoProchainPrecheRepository;
import org.site.entities.InfoProchainPreche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoProchainPrecheMetierImpl implements InfoProchainPrecheMetier {

	@Autowired
	private InfoProchainPrecheRepository infoProchainPrecheMetierRepository;

	@Override
	public InfoProchainPreche saveInfoPreche(InfoProchainPreche info) {
		// TODO Auto-generated method stub
		return infoProchainPrecheMetierRepository.save(info);
	}

	@Override
	public List<InfoProchainPreche> listInfoPreche() {
		// TODO Auto-generated method stub
		return infoProchainPrecheMetierRepository.findAll();
	}

	@Override
	public InfoProchainPreche getInfoProchainPreche(Date d) {
		// TODO Auto-generated method stub
		return infoProchainPrecheMetierRepository.findOne(d);

	}

}
