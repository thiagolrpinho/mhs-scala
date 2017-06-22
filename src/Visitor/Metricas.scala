package Visitor

import br.unb.cic.mhs.ast._
import main.scala.br.unb.cic.mhs.ast.aritmetica.ExpressaoSoma

/**
  * Created by thiagoluis on 20/06/17.
  */
class Metricas() extends MHSvisitor {
  var total : Int = 0
  def visitar(e: ValorInteiro)  : Unit = total += 1
  def visitar(e: ValorBooleano) : Unit = total += 1
  def visitar(e: ExpressaoITE)  : Unit = {
    e.condicao.aceitar(this)
    e.clausulaElse.aceitar(this)
    e.clausulaThen.aceitar(this)
    total += 1
  }

  def visitar(e: ExpressaoSoma) : Unit = {
    e.lhs.aceitar(this)
    e.rhs.aceitar(this)
    total += 1
  }

  def visitar(e: ExpressaoLet)  : Unit = {
    e.expNomeada.aceitar(this)
    e.corpo.aceitar(this)

  }
  def visitar(e: Referencia)    : Unit = total += 1
  def visitar(e: Aplicacao)     : Unit = {
    for(a <- e.args)
      a.aceitar(this)
    total += 1
  }

}
