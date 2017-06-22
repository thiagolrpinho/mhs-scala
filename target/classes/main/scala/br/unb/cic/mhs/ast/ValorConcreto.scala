package br.unb.cic.mhs.ast

import Visitor.MHSvisitor

abstract class ValorConcreto[T](val valor : T) extends Valor {
  override def avaliar() : Valor = this
}

class ValorInteiro(valor: Int) extends ValorConcreto[Int](valor) {
  override def verificarTipo() : Tipo = TInteiro

  override def aceitar(visitor: MHSvisitor): Unit = {
    visitor.visitar(this)
  }
}

class ValorBooleano(valor : Boolean) extends ValorConcreto[Boolean](valor) {
  override def verificarTipo() : Tipo = TBooleano
  override def aceitar(visitor: MHSvisitor): Unit = {
    visitor.visitar(this)
  }
}