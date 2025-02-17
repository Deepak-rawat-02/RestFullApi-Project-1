package com.RestApiProject1.packages.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.RestApiProject1.packages.Model.CloudVender;
import com.RestApiProject1.packages.Repositary.CloudVenderRepository;

@Service
public class CloudVenderServiceImpl implements CloudeVenderService{
	
	@Autowired
	private CloudVenderRepository cloudVenderRepository;

	@Override
	public CloudVender createVender(CloudVender cloudVender) {
		return cloudVenderRepository.save(cloudVender);
		
	}

	@Override
	public String updatCloudVender(CloudVender cloudVender) {
		cloudVenderRepository.save(cloudVender);
		return "Successfully Updated";
	}

	@Override
	public List<CloudVender> getAllVender() {
		
		return cloudVenderRepository.findAll();
	}

	@Override
	public CloudVender getSingleVender(Long venderId) {
		
		return cloudVenderRepository.findById(venderId).get();
	}

	@Override
	public String deleteVender(Long venderId) {
		cloudVenderRepository.deleteById(venderId);
			return "Successfully Deleted";
	}

}
