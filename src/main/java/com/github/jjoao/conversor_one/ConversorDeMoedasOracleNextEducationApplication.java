package com.github.jjoao.conversor_one;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversorDeMoedasOracleNextEducationApplication {

    public static void main(String[] args) {
        // Carrega variáveis do .env antes de iniciar a aplicação
        Dotenv dotenv = Dotenv.configure()
                .directory("./") // Procura o .env na raiz do projeto
                .ignoreIfMissing() // Não falha se o arquivo não existir
                .load();

        // Define as variáveis no sistema
        dotenv.entries().forEach(entry ->
                System.setProperty(entry.getKey(), entry.getValue())
        );

        SpringApplication.run(ConversorDeMoedasOracleNextEducationApplication.class, args);
    }
}