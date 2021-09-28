package com.ufitness.service.service.dto;

import com.repository.repository.client.ClientEntity;
import com.ufitness.service.service.client.ClientRegistryDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientRegistryDTOService extends DTOService<ClientRegistryDTO, ClientEntity> {
    @Autowired
    public ClientRegistryDTOService(ModelMapper modelMapper) {
        super(modelMapper);
    }

    @Override
    public ClientEntity convertToEntity(ClientRegistryDTO clientRegistryDTO) {
        return modelMapper.map(clientRegistryDTO, ClientEntity.class);
    }

    @Override
    public ClientRegistryDTO convertToDTO(ClientEntity entity) {
        return modelMapper.map(entity, ClientRegistryDTO.class);
    }
}