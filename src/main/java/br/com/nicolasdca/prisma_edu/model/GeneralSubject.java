package br.com.nicolasdca.prisma_edu.model;

public enum GeneralSubject {
    LINGUAGENS,
    HUMANAS,
    MATEMATICA,
    NATUREZA;

    public String getSubject() {
        return switch (this) {
            case LINGUAGENS -> "Linguagens, Códigos e suas Tecnologias";
            case HUMANAS -> "Ciências Humanas e suas Tecnologias";
            case MATEMATICA -> "Matemática e suas Tecnologias";
            case NATUREZA -> "Ciências da Natureza e suas Tecnologias";
        };
    }
}
