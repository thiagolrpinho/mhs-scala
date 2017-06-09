package br.unb.cic.mhs.ast

import br.unb.cic.mhs.memoria.AmbienteExpressao

class Referencia(val id: String) extends Expressao {
   override def avaliar() : Valor = AmbienteExpressao.pesquisar(id).avaliar()
}