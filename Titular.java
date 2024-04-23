import java.util.ArrayList;
import java.util.List;

// Classe Titular representa cada titular de uma conta bancária
public class Titular {
    private String name;
    private int clientNumber;

    public Titular(String name, int clientNumber) {
        this.name = name;
        this.clientNumber = clientNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    // Dois titulares são iguais se seus números de cliente forem iguais
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Titular)) {
            return false;
        }
        Titular other = (Titular) obj;
        return this.clientNumber == other.clientNumber;
    }
}