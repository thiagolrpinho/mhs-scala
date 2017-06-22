package main.scala.br.unb.cic.mhs.ast

import br.unb.cic.mhs.ast.{Expressao, ExpressaoSoma, Valor, ValorInteiro}

/**
  * Created by thiagoluis on 22/06/17.
  */
class ExpressaoSub(lhs : Expressao, rhs : Expressao) extends ExpressaoSoma(lhs, rhs){
    override def avaliar() : Valor = {
      val v1 = lhs.avaliar().asInstanceOf[ValorInteiro]
      val v2 = rhs.avaliar().asInstanceOf[ValorInteiro]

      return new ValorInteiro(v1.valor - v2.valor);
    }
}
