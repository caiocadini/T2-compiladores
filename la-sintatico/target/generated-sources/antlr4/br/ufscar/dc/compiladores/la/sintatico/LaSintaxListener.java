// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.la.sintatico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LaSintaxParser}.
 */
public interface LaSintaxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LaSintaxParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LaSintaxParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(LaSintaxParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(LaSintaxParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(LaSintaxParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(LaSintaxParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(LaSintaxParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(LaSintaxParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(LaSintaxParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(LaSintaxParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(LaSintaxParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(LaSintaxParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(LaSintaxParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(LaSintaxParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(LaSintaxParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(LaSintaxParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(LaSintaxParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(LaSintaxParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(LaSintaxParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(LaSintaxParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(LaSintaxParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(LaSintaxParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(LaSintaxParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(LaSintaxParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(LaSintaxParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(LaSintaxParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(LaSintaxParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(LaSintaxParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(LaSintaxParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(LaSintaxParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(LaSintaxParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(LaSintaxParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(LaSintaxParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(LaSintaxParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(LaSintaxParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(LaSintaxParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(LaSintaxParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(LaSintaxParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(LaSintaxParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(LaSintaxParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(LaSintaxParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(LaSintaxParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(LaSintaxParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(LaSintaxParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(LaSintaxParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(LaSintaxParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(LaSintaxParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(LaSintaxParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(LaSintaxParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(LaSintaxParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(LaSintaxParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(LaSintaxParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(LaSintaxParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(LaSintaxParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(LaSintaxParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(LaSintaxParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(LaSintaxParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(LaSintaxParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(LaSintaxParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(LaSintaxParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(LaSintaxParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(LaSintaxParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(LaSintaxParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(LaSintaxParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(LaSintaxParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(LaSintaxParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(LaSintaxParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(LaSintaxParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(LaSintaxParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(LaSintaxParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(LaSintaxParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(LaSintaxParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(LaSintaxParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(LaSintaxParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(LaSintaxParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(LaSintaxParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(LaSintaxParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(LaSintaxParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(LaSintaxParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(LaSintaxParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(LaSintaxParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(LaSintaxParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(LaSintaxParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(LaSintaxParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(LaSintaxParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(LaSintaxParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(LaSintaxParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(LaSintaxParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(LaSintaxParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(LaSintaxParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(LaSintaxParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(LaSintaxParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(LaSintaxParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(LaSintaxParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(LaSintaxParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(LaSintaxParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#op_logico1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico1(LaSintaxParser.Op_logico1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#op_logico1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico1(LaSintaxParser.Op_logico1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LaSintaxParser#op_logico2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico2(LaSintaxParser.Op_logico2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LaSintaxParser#op_logico2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico2(LaSintaxParser.Op_logico2Context ctx);
}