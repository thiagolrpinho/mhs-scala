package test.scala.br.unb.cic.mhs.Aritimetica

import br.unb.cic.mhs.ast.ValorInteiro
import main.scala.br.unb.cic.mhs.ast.aritmetica.ExpressaoSoma
import org.scalatest.{FlatSpec, Matchers}

class ExpressaoSomaTeste extends FlatSpec with Matchers {
  "Uma soma entre os valores 3 e 4" should "levar ao valor sete" in {
    val soma = new ExpressaoSoma(new ValorInteiro(3), new ValorInteiro(4));
    soma.avaliar().asInstanceOf[ValorInteiro].valor should be (7);
  }
  
  
}