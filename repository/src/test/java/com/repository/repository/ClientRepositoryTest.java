package com.repository.repository;

import com.repository.repository.client.ClientEntity;
import com.repository.repository.client.ClientRepository;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class ClientRepositoryTest {
    @Autowired
    private ClientRepository clientRepository;

    @AfterAll
    void tearDown() {
        clientRepository.deleteAll();
    }

    @Test
    void shouldSaveClientWithUniqueId() {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setName("Unique name");
        clientEntity.setPassword("123487874");
        clientEntity.setEmail("unique@gmail.com");
        AssertionsForClassTypes.assertThat(1L).isEqualTo(clientRepository.save(clientEntity).getId());
    }
}
