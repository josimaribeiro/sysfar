package br.com.sistema.utils;

import java.util.Base64;

import org.springframework.stereotype.Component;

@Component
public class CryptoUtil {

    private static final String SECRET_KEY = "chave-secreta"; // ideal usar algo seguro

    public String encrypt(String plainText) {
        // exemplo simples (não usar em produção!)
        return Base64.getEncoder().encodeToString((plainText + SECRET_KEY).getBytes());
    }

    public String decrypt(String encryptedText) {
        String decoded = new String(Base64.getDecoder().decode(encryptedText));
        return decoded.replace(SECRET_KEY, "");
    }
}
