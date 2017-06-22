package br.unb.cic.mhs

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import br.unb.cic.mhs.ast.ValorInteiro
import main.scala.br.unb.cic.mhs.ast.aritmetica.ExpressaoSoma

class ExpressaoSomaTeste extends FlatSpec with Matchers {
  "Uma soma entre os valores 3 e 4" should "levar ao valor sete" in {
    val soma = new ExpressaoSoma(new ValorInteiro(3), new ValorInteiro(4));
    soma.avaliar().asInstanceOf[ValorInteiro].valor should be (7);
  }
  
  
}