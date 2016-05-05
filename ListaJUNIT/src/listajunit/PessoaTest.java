package listajunit;

import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaTest {

	@Test
	public void ConstructorTest() {
		Pessoa pessoa1 = new Pessoa("raquel", 22);
		assertEquals("raquel", pessoa1.getNome());
		assertEquals(22, pessoa1.getIdade());
	}
}
