package br.queiroga;

public class ContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new CorolaCar(100, "cheio", "azul");
        } else if ("B".equals(requestedGrade)) {
            return new CorolaCar(100, "medio", "branco");
        } else {
            return null;
        }
    }
}
