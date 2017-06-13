package br.unb.cic.mhs.ast

abstract class ValorConcreto[T](val valor : T) extends Valor {
  override def avaliar() : Valor = this
}

class ValorInteiro(valor: Int) extends ValorConcreto[Int](valor) {
  override def verificarTipo() : Tipo = TInteiro 
}

class ValorBooleano(valor : Boolean) extends ValorConcreto[Boolean](valor) {
  override def verificarTipo() : Tipo = TBooleano
}