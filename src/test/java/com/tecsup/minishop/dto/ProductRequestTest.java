package com.tecsup.minishop.dto;

import com.tecsup.minishop.model.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRequestTest {

    @Test
    void toEntity_copiaLosCamposYNoAsignaId() {
        // Arrange
        ProductRequest request = new ProductRequest("Mouse Logitech", 80.0, 15);

        // Act
        Product product = request.toEntity();

        // Assert
        assertNull(product.getId());
        assertEquals("Mouse Logitech", product.getName());
        assertEquals(80.0, product.getPrice());
        assertEquals(15, product.getStock());
    }
}