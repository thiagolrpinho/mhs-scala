package br.unb.cic.mhs.ast

import Visitor.MHSvisitor

class Tipo 

case object TInteiro extends Tipo 
case object TBooleano extends Tipo 
case object TErro extends Tipo

trait Expressao {
  def avaliar() : Valor
  def verificarTipo() : Tipo
  def aceitar(visitor: MHSvisitor): Unit
}