package br.unb.cic.mhs.ast

import Visitor.MHSvisitor

/**
 * Epressao If-Then-Else, permitindo algo como: 
 * 
 * 4 + (If cond Then 5 Else 10)
 */
class ExpressaoITE(val condicao: Expressao, val clausulaThen: Expressao, val clausulaElse: Expressao) extends Expressao{
  override def avaliar() : Valor = 
   if (condicao.avaliar().asInstanceOf[ValorBooleano].valor) 
      clausulaThen.avaliar()
   else clausulaElse.avaliar()

  override def verificarTipo(): Tipo = { //CORRIGIR, OS DOIS TIPOS DEVEM SER IGUAIS
    if(condicao.verificarTipo().equals(TBooleano)){
      val t1 = clausulaThen.verificarTipo
      val t2 = clausulaElse.verificarTipo
      return if (t1.equals(TErro) || t2.equals(TErro)) TErro else {
        if(condicao.avaliar().asInstanceOf[ValorBooleano].valor) return t1
        else t2
      }
    } else TErro

  }

  override def aceitar(visitor: MHSvisitor): Unit = {
    visitor.visitar(this)
  }
}