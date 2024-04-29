grammar LaSintax;


/* PALAVRAS CHAVE */
//Algoritmo
ALGORITMO: 'algoritmo';
FIM_ALGORITMO: 'fim_algoritmo';
//Tipos de dados
LIT : 'literal';
INT: 'inteiro';
REAL: 'real';
LOG: 'logico';
REG: 'registro';
FIM_REG: 'fim_registro';
VAR: 'var';
CONST: 'constante';

//Booleanos
VERDADEIRO: 'verdadeiro';
FALSO: 'falso';

//Ponteiros e Vetores
ENDERECO: '^';
PONTEIRO: '&';
PONTO: '.';
ABRE_VETOR: '[';
FECHA_VETOR: ']';


//Delimitadores
DELIM    :   ':'
    ;
ABREPAR :   '('
    ;
FECHAPAR:   ')'
    ;
COMMA: ',';

//Comandos
CMD_LEIA: 'leia';
CMD_ESCREVA: 'escreva';
CMD_SE : 'se';
CMD_FIMSE: 'fim_se';
CMD_SENAO: 'senao';
CMD_ENTAO: 'entao';
CMD_CASO: 'caso';
CMD_FIMCASO: 'fim_caso';
CMD_PARA: 'para';
CMD_FIMPARA: 'fim_para';
CMD_ENQUANTO: 'enquanto';
CMD_FIMENQUANTO:'fim_enquanto';
CMD_FACA: 'faca';
CMD_ATE: 'ate';
CMD_SEJA: 'seja';
CMD_ATIBUICAO: '<-';
CMD_RETORNE: 'retorne';
CMD_DECLARE: 'declare';
CMD_TIPO: 'tipo';
/*PROCEDIMENTOS E FUNÇÕES */
PROCEDIMENTO: 'procedimento';
FIM_PROCEDIMENTO: 'fim_procedimento';
FUNCAO: 'funcao';
FIM_FUNCAO: 'fim_funcao';
/* OPERADORES */
INTERVALO: '..';
//Operadores Aritméticos
OPARIT_SOMA    :   '+'
    ;
OPARIT_SUB: '-';
OPARIT_MULT : '*';
OPARIT_DIV : '/';
OPARIT_RESTO: '%';
//Operadores Relacionais
OPREL_MENOR: '<';
OPREL_MAIOR: '>';
OPREL_IGUAL: '=';
OPREL_DIFER: '<>';
OPREL_MAIORIGUAL:'>=';
OPREL_MENORIGUAL:'<=';
//Operadores Lógicos
OPLOG_E: 'e';
OPLOG_OU: 'ou';
OPLOG_NAO: 'nao';

/* VALORES E VARIÁVEIS */
NUM_INT    : ('0'..'9')+
    ;
NUM_REAL    : ('0'..'9')+ ('.' ('0'..'9')+)?
    ;
//Variavel
IDENT : ('a'..'z'|'A'..'Z') ('_' | 'a'..'z'|'A'..'Z'|'0'..'9')*
     ;
//String
CADEIA    : '"' ( ~('\n') )*? '"'
;
//Pular na leitura quando encontrar comentário, espaço em branco, quebra de linha, tabulação, não quebramento da linha
COMENTARIO: '{' ( ~('\n') )*? '}' {skip();}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;
/* ERROS */
CADEIA_LITERAL_NAO_FECHADA   : '"' ( ~('\n'))*?;
COMENTARIO_NAO_FECHADO: '{' ( ~('\n') )*? ;
SIMBOLO_NAO_ENCONTRADO: .;


/* REGRAS DE SINTAXE Aplicadas com base no documento da linguagem fornecido pelo professor Jander*/
programa: declaracoes 'algoritmo' corpo 'fim_algoritmo' ;
declaracoes: decl_local_global;
decl_local_global: (declaracao_local | declaracao_global)*;
declaracao_local: 'declare' variavel | 'constante' IDENT ':' tipo_basico '=' valor_constante | 'tipo' IDENT ':' tipo;
variavel: identificador (',' identificador)* ':' tipo;
identificador: IDENT ('.' IDENT)* dimensao;
dimensao: ('[' exp_aritmetica ']')*;
tipo: registro | tipo_estendido;
tipo_basico: 'literal' | 'inteiro' | 'real' | 'logico';
tipo_basico_ident: tipo_basico | IDENT;
tipo_estendido:  '^' ? tipo_basico_ident;
valor_constante: CADEIA | NUM_INT | NUM_REAL | 'verdadeiro' | 'falso';
registro: 'registro' variavel* 'fim_registro';
declaracao_global: 'procedimento' IDENT '(' parametros? ')' declaracao_local* cmd* 'fim_procedimento' | 'funcao' IDENT '(' parametros?')' ':' tipo_estendido declaracao_local* cmd* 'fim_funcao';
parametro: 'var'? identificador (',' identificador)* ':' tipo_estendido;
parametros: parametro (',' parametro)*;
corpo: declaracao_local* cmd*;
cmd: cmdLeia | cmdEscreva | cmdSe | cmdCaso | cmdPara | cmdEnquanto | cmdFaca | cmdAtribuicao | cmdChamada | cmdRetorne;
cmdLeia: 'leia' '(' '^'? identificador (',' '^'? identificador)* ')';
cmdEscreva: 'escreva' '(' expressao (',' expressao)* ')';
cmdSe: 'se' expressao 'entao' cmd* ('senao' cmd*)? 'fim_se';
cmdCaso: 'caso' exp_aritmetica 'seja' selecao ('senao' cmd*)? 'fim_caso';
cmdPara: 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' cmd* 'fim_para';
cmdEnquanto: 'enquanto' expressao 'faca' cmd* 'fim_enquanto';
cmdFaca: 'faca' cmd* 'ate' expressao;
cmdAtribuicao: '^'? identificador '<-' expressao;
cmdChamada: IDENT '(' expressao (',' expressao)* ')';
cmdRetorne: 'retorne' expressao;
selecao: item_selecao*;
item_selecao: constantes ':' cmd*;
constantes: numero_intervalo (',' numero_intervalo)*;
numero_intervalo: op_unario? NUM_INT ('..' op_unario? NUM_INT)?;
op_unario: '-';
exp_aritmetica: termo (op1 termo)*;
termo: fator (op2 fator)*;
fator: parcela (op3 parcela)*;
op1: '+' | '-';
op2: '*' | '/';
op3: '%';
parcela: op_unario? parcela_unario | parcela_nao_unario;
parcela_unario: '^'? identificador | IDENT '(' expressao (',' expressao)* ')' | NUM_INT | NUM_REAL | '(' expressao ')';
parcela_nao_unario: '&' identificador | CADEIA;
exp_relacional: exp_aritmetica (op_relacional exp_aritmetica)?;
op_relacional: '='|'<>'|'>='|'<='|'>'|'<';
expressao: termo_logico (op_logico1 termo_logico)*;
termo_logico: fator_logico (op_logico2 fator_logico)*;
fator_logico: 'nao'? parcela_logica;
parcela_logica: ('verdadeiro' | 'falso') | exp_relacional;
op_logico1: 'ou';
op_logico2: 'e';