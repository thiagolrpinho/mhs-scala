package test.scala.br.unb.cic.mhs

import br.unb.cic.mhs.ast.ValorInteiro
import main.scala.br.unb.cic.mhs.ast.aritmetica.ExpressaoSub
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by thiagoluis on 22/06/17.
  */
class ExpressaoSubTeste extends FlatSpec with Matchers {
  "Uma soma entre os valores 3 e 4" should "levar ao valor menos um" in {
    val sub = new ExpressaoSub(new ValorInteiro(3), new ValorInteiro(4));
    sub.avaliar().asInstanceOf[ValorInteiro].valor should be(-1);
  }
}
