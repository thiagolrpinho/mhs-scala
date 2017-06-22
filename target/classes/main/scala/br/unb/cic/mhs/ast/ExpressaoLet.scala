package br.unb.cic.mhs.ast

import Visitor.MHSvisitor
import br.unb.cic.mhs.memoria.Ambiente
import br.unb.cic.mhs.memoria.AmbienteExpressao

class ExpressaoLet(val id : String , val expNomeada: Expressao , val corpo: Expressao) extends Expressao {
  override def avaliar() : Valor = {
    AmbienteExpressao.associar(id, expNomeada)
    return corpo.avaliar()
  }
  
  override def verificarTipo : Tipo = 
    if(expNomeada.verificarTipo().equals(TErro)) 
      TErro
    else  corpo.verificarTipo()

  override def aceitar(visitor: MHSvisitor): Unit = {
    visitor.visitar(this)
  }
}