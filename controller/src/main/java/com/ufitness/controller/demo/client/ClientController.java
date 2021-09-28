package com.ufitness.controller.demo.client;

import com.ufitness.service.service.client.ClientRegistryDTO;
import com.ufitness.service.service.client.ClientService;
import com.ufitness.service.service.dto.ClientRegistryDTOService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ufitness/client")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ClientRegistryDTO saveClient(@RequestBody ClientRegistryDTO clientRegistryDTO) {
        return clientService.saveClient(clientRegistryDTO);
    }
}