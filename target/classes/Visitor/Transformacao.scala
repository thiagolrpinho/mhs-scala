package Visitor

import br.unb.cic.mhs.ast._

/**
  * Created by thiagoluis on 22/06/17.
  *
class TransformacaoITE extends MHSvisitor{
  var exp, esquerdo, direito: Expressao

  override def visitar(e: ValorInteiro) = exp = e

  override def visitar(e: ValorBooleano) = exp = e

  override def visitar(e: ExpressaoITE) = {
    if(e.clausulaThen.avaliar() == true && e.clausulaElse.avaliar == false)
      exp = e.condicao
    else
      e.clausulaThen.aceitar(this)
      esquerdo = exp
      e.clausulaElse.aceitar(this)
      direito = exp
      exp = new ExpressaoITE(e.condicao, esquerdo, direito)
  }

  override def visitar(e: ExpressaoSoma) = {
    e.lhs.aceitar(this)
    esquerdo = exp
    e.rhs.aceitar(this)
    direito = exp
    exp = new ExpressaoSoma(esquerdo, direito)
  }
  override def visitar(e: ExpressaoLet) = {
    e.corpo.aceitar(this)
    direito = exp
    e.expNomeada.aceitar(this)
    esquerdo = exp
    exp = new ExpressaoLet(e.id, esquerdo, direito)
  }
  override def visitar(e: Referencia)  = exp = e
  override def visitar(e: Aplicacao) = {

  }

}
*/