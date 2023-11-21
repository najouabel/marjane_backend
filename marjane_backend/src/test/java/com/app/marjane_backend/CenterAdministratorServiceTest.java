package com.app.marjane_backend;

import com.app.marjane_backend.Service.implementation.CenterAdministratorServiceImp;
import com.app.marjane_backend.entities.CenterAdministrator;
import com.app.marjane_backend.repositories.CenterAdministratorRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class CenterAdministratorServiceTest {

    @Mock
    private CenterAdministratorRepository repository;

    @InjectMocks
    private CenterAdministratorServiceImp service;

    @Test
    public void testCreateCenterAdministrator() {
        // Given
        CenterAdministrator centerAdministrator = new CenterAdministrator();
        centerAdministrator.setEmail("test@example.com");
        centerAdministrator.setPassword("password123");

        // Mocking repository save method
        when(repository.save(centerAdministrator)).thenReturn(centerAdministrator);

        // When
        CenterAdministrator createdAdministrator = service.create(centerAdministrator);

        // Then
        assertEquals(centerAdministrator.getEmail(), createdAdministrator.getEmail());
        assertEquals(centerAdministrator.getPassword(), createdAdministrator.getPassword());
        verify(repository, times(1)).save(centerAdministrator);
    }

}
