package test.scala.br.unb.cic.mhs

import Visitor.Metricas
import br.unb.cic.mhs.ast._
import br.unb.cic.mhs.memoria.AmbienteDecFuncao
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by thiagoluis on 20/06/17.
  */
class MetricasTeste extends FlatSpec with Matchers {

    "O total de expressões 3 + (4+5)" should " levar ao valor cinco" in {
      val soma = new ExpressaoSoma(new ValorInteiro(3), new ExpressaoSoma(new ValorInteiro(4), new ValorInteiro(5)))
      val m : Metricas = new Metricas()

      soma.aceitar(m)

      m.total should be (5);
     }

}
