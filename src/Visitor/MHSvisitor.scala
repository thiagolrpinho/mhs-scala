package Visitor

import br.unb.cic.mhs.ast._
import main.scala.br.unb.cic.mhs.ast.aritmetica.ExpressaoSoma

/**
  * Created by thiagoluis on 20/06/17.
  * Define a hierarquia de classes visitors.
  * Precisa ter um método visitar para cada
  * classe concreta.
  */
trait MHSvisitor{
  def visitar(e: ValorInteiro)  : Unit
  def visitar(e: ValorBooleano) : Unit
  def visitar(e: ExpressaoITE)  : Unit
  def visitar(e: ExpressaoSoma) : Unit
  def visitar(e: ExpressaoLet)  : Unit
  def visitar(e: Referencia)    : Unit
  def visitar(e: Aplicacao)     : Unit
}
