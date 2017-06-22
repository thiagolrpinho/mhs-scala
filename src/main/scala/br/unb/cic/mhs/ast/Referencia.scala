package br.unb.cic.mhs.ast

import Visitor.MHSvisitor
import br.unb.cic.mhs.memoria.AmbienteExpressao

class Referencia(val id: String) extends Expressao {
   override def avaliar() : Valor = AmbienteExpressao.pesquisar(id).avaliar()

   override def verificarTipo(): Tipo = AmbienteExpressao.pesquisar(id).verificarTipo()

   override def aceitar(visitor: MHSvisitor): Unit = {
      visitor.visitar(this)
   }
}