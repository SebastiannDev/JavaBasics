package DatosAvanzados;

import java.math.BigDecimal;

public class DatoBigDecimal {
    public static void main(String[] args) {
        BigDecimal valorA = new BigDecimal(0.1f);
        BigDecimal valorB = new BigDecimal(10f);

        // operadores BigDecimal
        // valorA.multiply(valorB);

        BigDecimal resultado = valorA.multiply(valorB);

        System.out.println(resultado.toString());
    }
}
