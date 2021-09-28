package com.ufitness.service.service.client;

import com.repository.repository.client.ClientEntity;
import com.repository.repository.client.ClientRepository;
import com.ufitness.service.service.dto.ClientRegistryDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {
    private final ClientRepository clientRepository;
    private final ClientRegistryDTOService clientRegistryDTOService;

    @Autowired
    public ClientService(ClientRepository clientRepository, ClientRegistryDTOService clientRegistryDTOService) {
        this.clientRepository = clientRepository;
        this.clientRegistryDTOService = clientRegistryDTOService;
    }

    @Transactional
    public ClientRegistryDTO saveClient(ClientRegistryDTO clientRegistryDTO) {
        ClientEntity clientEntity = clientRegistryDTOService.convertToEntity(clientRegistryDTO);
        ClientEntity savedClient = clientRepository.save(clientEntity);
        return clientRegistryDTOService.convertToDTO(savedClient);
    }
}