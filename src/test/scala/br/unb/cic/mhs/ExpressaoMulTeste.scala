package test.scala.br.unb.cic.mhs

import br.unb.cic.mhs.ast.ValorInteiro
import main.scala.br.unb.cic.mhs.ast.aritmetica.ExpressaoMul
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by thiagoluis on 22/06/17.
  */
class ExpressaoMulTeste extends FlatSpec with Matchers {
  "Uma multiplicação entre os valores 3 e 4" should "levar ao valor menos 12" in {
    val mul = new ExpressaoMul(new ValorInteiro(3), new ValorInteiro(4));
    mul.avaliar().asInstanceOf[ValorInteiro].valor should be (12);
  }
}
