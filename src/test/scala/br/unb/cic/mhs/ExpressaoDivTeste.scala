package test.scala.br.unb.cic.mhs

import br.unb.cic.mhs.ast.ValorInteiro
import main.scala.br.unb.cic.mhs.ast.{ExpressaoDiv}
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by thiagoluis on 22/06/17.
  */
class ExpressaoDivTeste extends FlatSpec with Matchers {
  "Uma Divtiplicação entre os valores 3 e 4" should "levar ao valor menos 12" in {
    val Div = new ExpressaoDiv(new ValorInteiro(12), new ValorInteiro(4));
    Div.avaliar().asInstanceOf[ValorInteiro].valor should be (3);
  }
}
