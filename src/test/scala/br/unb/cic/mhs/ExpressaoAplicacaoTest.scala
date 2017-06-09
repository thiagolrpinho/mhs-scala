package br.unb.cic.mhs

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import br.unb.cic.mhs.ast.DecFuncao
import br.unb.cic.mhs.ast.ExpressaoSoma
import br.unb.cic.mhs.ast.ValorInteiro
import br.unb.cic.mhs.ast.Referencia
import br.unb.cic.mhs.memoria.AmbienteDecFuncao
import br.unb.cic.mhs.ast.Aplicacao

class ExpressaoAplicacaoTest extends FlatSpec with Matchers {
  
  "uma aplicacao inc 4 (onde existe inc x = x + 1) " should " levar ao valor 5" in {
    val inc = new DecFuncao("inc", List("x"), new ExpressaoSoma(new Referencia("x"), new ValorInteiro(1)))  
    val app = new Aplicacao("inc", new ValorInteiro(4))
    
    AmbienteDecFuncao.associar("inc", inc)
    
    app.avaliar().asInstanceOf[ValorInteiro].valor should be (5)
  }
  
}