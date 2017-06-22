package test.scala.br.unb.cic.mhs.Aritimetica

import br.unb.cic.mhs.ast.ValorInteiro
import main.scala.br.unb.cic.mhs.ast.aritmetica.ExpressaoModulo
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by thiagoluis on 22/06/17.
  */
class ExpressaoModuloTeste extends FlatSpec with Matchers {
  "Um módulo entre os valores 12 e 4" should "levar ao valor menos 0" in {
    val Modulo = new ExpressaoModulo(new ValorInteiro(12), new ValorInteiro(4));
    Modulo.avaliar().asInstanceOf[ValorInteiro].valor should be (0);
  }

  "Uma módulo entre os valores 12 e 5" should "levar ao valor menos 2" in {
    val Modulo = new ExpressaoModulo(new ValorInteiro(12), new ValorInteiro(5));
    Modulo.avaliar().asInstanceOf[ValorInteiro].valor should be (2);
  }
}
