package com.openclassrooms.api;

import com.openclassrooms.api.controller.EmployeeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = EmployeeController.class)
public class EmployeeControllerUnitTests {
    @Autowired
    private MockMvc mockMvc;

     @Test
     public void testGetEmployees() throws Exception {
         mockMvc.perform(get("/employees"))
                 .andExpect(status().isOk());
     }
}
