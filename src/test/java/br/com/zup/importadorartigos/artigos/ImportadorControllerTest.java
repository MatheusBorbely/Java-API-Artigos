package br.com.zup.importadorartigos.artigos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class ImportadorControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Deve encontrar um endpoint {/artigos/importador} com método POST criado")
    void test() throws Exception {
        MvcResult result = this.mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/artigos/importador")
                ).andReturn();

        Assertions.assertNotEquals(HttpStatus.NOT_FOUND.value(), result.getResponse().getStatus());
    }
}