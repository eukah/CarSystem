import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veiculo[] veiculos = new Veiculo[5];

        for (int i = 0; i < veiculos.length; i++) {
            veiculos[i] = new Veiculo();

            System.out.println("Informe os dados do veículo " + (i + 1));

            System.out.print("Marca: ");
            veiculos[i].setMarca(scanner.nextLine());

            System.out.print("Modelo: ");
            veiculos[i].setModelo(scanner.nextLine());

            System.out.print("Ano: ");
            veiculos[i].setAno(scanner.nextInt());
            scanner.nextLine(); // Consumir a quebra de linha

            System.out.print("Potência do motor: ");
            veiculos[i].getMotor().setPotencia(scanner.nextInt());
            scanner.nextLine(); // Consumir a quebra de linha

            System.out.print("Tipo do motor: ");
            veiculos[i].getMotor().setTipo(scanner.nextLine());
        }

        System.out.println("Dados dos veículos:");
        for (Veiculo veiculo : veiculos) {
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Ano: " + veiculo.getAno());
            System.out.println("Potência do motor: " + veiculo.getMotor().getPotencia());
            System.out.println("Tipo do motor: " + veiculo.getMotor().getTipo());
            System.out.println();
        }
    }
}