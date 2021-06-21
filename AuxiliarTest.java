import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste AuxiliarTest.
 *
 * @author João Pedro de Moura Medeiros
 * @version 14/06/2021
 */
public class AuxiliarTest
{
    /**
     * Construtor default para a classe de teste AuxiliarTest
     */
    public AuxiliarTest()
    {
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void Teste1()
    {
        assertSame(4, Auxiliar.senhas().length);
    }
}
