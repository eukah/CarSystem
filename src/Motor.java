class Motor {
    private int potencia;
    private String tipo;

    public Motor() {
        potencia = 0;
        tipo = " ";
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getTipo() {
        return tipo;
    }
}
