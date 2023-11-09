class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private Motor motor;

    public Veiculo() {
        marca = " ";
        modelo = " ";
        ano = 0;
        motor = new Motor();
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public Motor getMotor() {
        return motor;
    }
}
