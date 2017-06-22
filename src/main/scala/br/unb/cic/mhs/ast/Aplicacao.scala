package br.unb.cic.mhs.ast

import Visitor.MHSvisitor
import br.unb.cic.mhs.memoria.AmbienteDecFuncao
import br.unb.cic.mhs.memoria.AmbienteExpressao

class Aplicacao (val nome: String, val args: Expressao*) extends Expressao{
  override def avaliar(): Valor = {
    val funcao = AmbienteDecFuncao.pesquisar(nome)
    for(i <- 0 until funcao.args.size){
      AmbienteExpressao.associar(funcao.args(i), args(i))
    }
    funcao.corpo.avaliar
  }

  override def verificarTipo(): Tipo = {
    val funcao = AmbienteDecFuncao.pesquisar(nome)
    for( i <- 0 until funcao.args.size) {
      AmbienteExpressao.associar(funcao.args(i), args(i))
    }
    funcao.corpo.verificarTipo
  }

  override def aceitar(visitor: MHSvisitor): Unit = {
    visitor.visitar(this)
  }
}