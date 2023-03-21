public enum Categoria {

    MEDICINAGENERAL("Medicina General"),
    PEDIATRIA("Pediatría"),
    TRAUMATOLOGIA("Traumatología"),
    DERMATOLOGIA("Dermatología"),
    OFTALMOLOGIA("Oftalmología");

    private String categoria;

    private Categoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

}
