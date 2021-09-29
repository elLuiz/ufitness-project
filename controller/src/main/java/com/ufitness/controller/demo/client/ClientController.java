package com.ufitness.controller.demo.client;

import com.ufitness.service.service.client.ClientDTO;
import com.ufitness.service.service.client.ClientRegistryDTO;
import com.ufitness.service.service.client.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ufitness/client")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<ClientDTO> saveClient(@RequestBody ClientRegistryDTO clientRegistryDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clientService.saveClient(clientRegistryDTO));
    }
}