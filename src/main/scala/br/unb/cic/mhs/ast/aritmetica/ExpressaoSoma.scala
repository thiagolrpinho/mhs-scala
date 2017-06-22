package main.scala.br.unb.cic.mhs.ast.aritmetica

import Visitor.MHSvisitor
import br.unb.cic.mhs.ast._


class ExpressaoSoma(lhs : Expressao, rhs : Expressao) extends ExpressaoBinaria(lhs, rhs) {
  /* essa implementacao eh fragil, pois nao verifica os tipos */
  override def avaliar() : Valor = {
    val v1 = lhs.avaliar().asInstanceOf[ValorInteiro]
    val v2 = rhs.avaliar().asInstanceOf[ValorInteiro]
      
    return new ValorInteiro(v1.valor + v2.valor); 
  }
  
  override def verificarTipo : Tipo = {
    val t1 = lhs.verificarTipo()
    val t2 = rhs.verificarTipo()
    
    return if(t1.equals(TInteiro) && t2.equals(TInteiro)) TInteiro else TErro
          
  }
  override def aceitar(visitor: MHSvisitor): Unit = {
    visitor.visitar(this)
  }
}