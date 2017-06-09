package br.unb.cic.mhs.ast

import br.unb.cic.mhs.memoria.Ambiente
import br.unb.cic.mhs.memoria.AmbienteExpressao

class ExpressaoLet(id : String , expNomeada: Expressao , corpo: Expressao) extends Expressao {
  override def avaliar() : Valor = {
    AmbienteExpressao.associar(id, expNomeada)
    return corpo.avaliar()
  }
}