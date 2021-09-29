package com.ufitness.service.service.client;

import com.repository.repository.client.ClientEntity;
import com.repository.repository.client.ClientRepository;
import com.ufitness.service.service.dto.ClientDTOService;
import com.ufitness.service.service.dto.ClientRegistryDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {
    private final ClientRepository clientRepository;
    private final ClientRegistryDTOService clientRegistryDTOService;
    private final ClientDTOService clientDTOService;

    @Autowired
    public ClientService(ClientRepository clientRepository, ClientRegistryDTOService clientRegistryDTOService, ClientDTOService clientDTOService) {
        this.clientRepository = clientRepository;
        this.clientRegistryDTOService = clientRegistryDTOService;
        this.clientDTOService = clientDTOService;
    }

    @Transactional
    public ClientDTO saveClient(ClientRegistryDTO clientRegistryDTO) {
        ClientEntity clientEntity = clientRegistryDTOService.convertToEntity(clientRegistryDTO);
        ClientEntity savedClient = clientRepository.save(clientEntity);
        return clientDTOService.convertToDTO(savedClient);
    }
}