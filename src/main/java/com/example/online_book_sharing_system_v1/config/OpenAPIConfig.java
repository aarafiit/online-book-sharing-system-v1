package com.example.online_book_sharing_system_v1.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
        info = @Info(
                title = "Online Book Sharing System",
                version = "1.0",
                description = "This API allows users to share and borrow books. It includes functionalities for managing books, users, and transactions.",
                contact = @Contact(
                        name = "Abdullah Al Rafi",
                        email = "rafiabdullah748@gmail.com",
                        url = "https://google.com"
                ),
                license = @License(
                        name = "NSTU License",
                        url = "https://opensource.org/licenses/MIT"
                )
        )
)
public class OpenAPIConfig {
}
