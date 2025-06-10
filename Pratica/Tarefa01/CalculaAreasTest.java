import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculaAreasTest {

    // Testes para calculaAreaRetangulo
    @Test
    void testeCalculaAreaRetangulo_Valido() {
        assertEquals(25.0, CalculaAreas.calculaAreaRetangulo(5.0, 5.0), "A area de um retangulo 5x5 deve ser 25.0");
        assertEquals(0.0, CalculaAreas.calculaAreaRetangulo(0.0, 10.0), "A area de um retangulo 0x10 deve ser 0.0");
        assertEquals(12.5, CalculaAreas.calculaAreaRetangulo(2.5, 5.0), "A area de um retangulo 2.5x5 deve ser 12.5");
    }

    @Test
    void testeCalculaAreaRetangulo_Negativo() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            CalculaAreas.calculaAreaRetangulo(-5.0, 5.0);
        });
        assertEquals("Digite um valor positivo.", exception.getMessage());
    }

    // Testes para calculaAreaCircunferencia
    @Test
    void testeCalculaAreaCircunferencia_Valido() {
        assertEquals(Math.PI * 2 * 2, CalculaAreas.calculaAreaCircunferencia(2.0), 0.001, "Area de circulo raio 2");
        assertEquals(0.0, CalculaAreas.calculaAreaCircunferencia(0.0), "Area de círculo raio 0");
    }

    @Test
    void testeCalculaAreaCircunferencia_Negativo() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            CalculaAreas.calculaAreaCircunferencia(-2.0);
        });
        assertEquals("Digite um valor positivo.", exception.getMessage());
    }

    // Testes para calculaAreaTriangulo
    @Test
    void testeCalculaAreaTriangulo_Valido() {
        assertEquals(10.0, CalculaAreas.calculaAreaTriangulo(4.0, 5.0), "Area triangulo 4x5");
        assertEquals(0.0, CalculaAreas.calculaAreaTriangulo(0.0, 5.0), "area triangulo base 0");
    }

    @Test
    void testeCalculaAreaTriangulo_Negativo() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            CalculaAreas.calculaAreaTriangulo(-4.0, 5.0);
        });
        assertEquals("Digite um valor positivo.", exception.getMessage());
    }

}
