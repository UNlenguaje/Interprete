grammar Lenguaje;

    inicio:           prog especificacion 'inicio' sentencias 'fin'  subrutinas ;
    inicio2:          prog especificacion 'inicio' sentencias 'fin'  ;
    prog:             'programa' ID| ;
    especificacion:   'var' var especificacion|'const' const especificacion|'tipos' tipos especificacion|;
    var:              ID (',' ID)* TK_DOS_PUNTOS rmt pc var|;
    const:            ID TK_ASIGNACION const2 pc const|;
    const2:           TK_NUMERO|TK_CADENA|'TRUE'|'FALSE'|'SI'|'NO';
    rmt:              tipodato |
                        'vector' TK_CORCHETE_IZQUIERDO vector TK_CORCHETE_DERECHO tipodato |
                        'matriz' TK_CORCHETE_IZQUIERDO matriz TK_CORCHETE_DERECHO tipodato |
                        'registro' registro;
    vector:          TK_NUMERO|ID|TK_MULTIPLICACION;
    matriz:          TK_NUMERO (TK_COMA TK_NUMERO)* (TK_COMA TK_MULTIPLICACION)* | TK_MULTIPLICACION (TK_COMA TK_MULTIPLICACION)*  | expre;
    matriz2:          TK_COMA matriz|;
    tipodato:         'registro' registro|'numerico'|'cadena'|'logico'|ID;
    registro:         TK_LLAVE_IZQUIERDA var TK_LLAVE_DERECHA;
    tipos:            ID TK_DOS_PUNTOS rmt tipos|;
    pc:               TK_PUNTO_y_coma|;
    sentencias:       ID idsentencia pc sentencias |
                        si |
                        'mientras'  TK_PARENTESIS_IZQUIERDO expre  TK_PARENTESIS_DERECHO  TK_LLAVE_IZQUIERDA  sentencias  TK_LLAVE_DERECHA TK_PUNTO_y_coma? sentencias |
                        'repetir'  sentencias  'hasta'  TK_PARENTESIS_IZQUIERDO  expre  TK_PARENTESIS_DERECHO TK_PUNTO_y_coma?  sentencias |
                        'eval'  TK_LLAVE_IZQUIERDA caso  'sino'  sentencias  TK_LLAVE_DERECHA TK_PUNTO_y_coma?  sentencias |
                        'desde'  ID  TK_ASIGNACION  expre  'hasta'  expre  incremento  TK_LLAVE_IZQUIERDA  sentencias TK_LLAVE_DERECHA  TK_PUNTO_y_coma? sentencias |
                        'imprimir' TK_PARENTESIS_IZQUIERDO imprimir TK_PARENTESIS_DERECHO TK_PUNTO_y_coma? sentencias |
                        'leer' TK_PARENTESIS_IZQUIERDO leer TK_PARENTESIS_DERECHO TK_PUNTO_y_coma? sentencias |
                        'dim' TK_PARENTESIS_IZQUIERDO leer TK_PARENTESIS_DERECHO TK_PUNTO_y_coma? sentencias |
                        'cls' TK_PARENTESIS_IZQUIERDO TK_PARENTESIS_DERECHO TK_PUNTO_y_coma? sentencias| funciones sentencias |;

    si:               'si' TK_PARENTESIS_IZQUIERDO expre TK_PARENTESIS_DERECHO TK_LLAVE_IZQUIERDA sentencias else TK_LLAVE_DERECHA TK_PUNTO_y_coma? sentencias;
    idsentencia:      (TK_PUNTO ID)* asigid int| asigid expre? TK_CADENA?  | asigid TK_PARENTESIS_IZQUIERDO expre TK_PARENTESIS_DERECHO
                       (logic TK_PARENTESIS_IZQUIERDO expre TK_PARENTESIS_DERECHO)*|
                      (TK_PUNTO ID)* TK_CORCHETE_IZQUIERDO vector TK_CORCHETE_DERECHO (TK_PUNTO ID)* asigid expre;
    int:              'int' expre|expre;
    leer:             ref ID (TK_COMA ID)* (TK_DOS_PUNTOS tipodato)* TK_PUNTO_y_coma? leer|TK_CADENA|;
    leer2:            TK_CORCHETE_IZQUIERDO leer3 TK_CORCHETE_DERECHO|TK_COMA leer|;
    leer3:            ID|TK_NUMERO;
    //imprimir:         idV imprimir2|TK_NUMERO imprimir2|TK_CADENA imprimir2 | funciones;
    imprimir:         (ID | TK_NUMERO | TK_CADENA | funciones) (TK_COMA (ID | TK_NUMERO | TK_CADENA | funciones))*;
    imprimir2:        TK_COMA imprimir|;
    asigid:           TK_DOS_PUNTOS|TK_ASIGNACION;
    expre:            (ID | funciones) (oper ID | oper TK_NUMERO | oper funciones |oper TK_CADENA | TK_PUNTO ID (oper expre)*)*
                      (TK_CORCHETE_IZQUIERDO (matriz | vector) TK_CORCHETE_DERECHO (oper TK_NUMERO)* (oper ID)*)? |
                      TK_PARENTESIS_IZQUIERDO expre TK_PARENTESIS_DERECHO (oper ID)* (oper TK_NUMERO)* (oper funciones)* (oper expre)* |
                      TK_NUMERO (oper ID)* (oper TK_NUMERO)* (oper funciones)* | TK_LLAVE_IZQUIERDA llaves TK_LLAVE_DERECHA|
                      'int' expre;
    llaves:           TK_LLAVE_IZQUIERDA llaves TK_LLAVE_DERECHA (TK_COMA llaves)*| TK_CADENA (TK_COMA llaves)* | TK_NUMERO (TK_COMA llaves)*;
    logic:            'or' expre|'and' expre|ID expre2;
    lista:            TK_NUMERO lista2|TK_CADENA lista2|TK_LLAVE_IZQUIERDA lista3 TK_LLAVE_DERECHA lista2;
    lista3:           TK_NUMERO lista2|TK_CADENA lista2|;
    lista2:           TK_COMA lista|;
    expre2:           TK_SUMA expre3|oper expre|TK_MULTIPLICACION expre3|;
    expre3:           idV|TK_NUMERO;
    oper:             TK_MAYOR|TK_MAYOR_igual|TK_MENOR|TK_MENOR_IGUAL|TK_IGUAL_QUE|TK_SUMA|TK_RESTA |TK_POTENCIACION | TK_MULTIPLICACION|
                            TK_MODULO|TK_DIVISION|'or'|'and' 'not'?| TK_DISTINTO_DE;
    else:             'sino' sielse else|;
    sielse:           'si' TK_PARENTESIS_IZQUIERDO expre TK_PARENTESIS_DERECHO else sentencias|sentencias;
    caso:             'caso' TK_PARENTESIS_IZQUIERDO expre and TK_PARENTESIS_DERECHO  sentencias  caso|;
    and:              'and' expre|;
    incremento:       'paso' negativo expre|;
    negativo:         TK_RESTA|;
    argumentos:       TK_NUMERO (TK_COMA (TK_NUMERO| ID| TK_CADENA))*|TK_CADENA (TK_COMA (TK_NUMERO| ID| TK_CADENA))*|ID (TK_COMA (TK_NUMERO| ID| TK_CADENA))*|;
    argumentos2:      TK_COMA argumentos|;
    subrutinas:       'subrutina' ID  TK_PARENTESIS_IZQUIERDO leer? TK_PARENTESIS_DERECHO valoref? inicio2   subrutinas |;

    //subrutinas:       'subrutina' ID  TK_PARENTESIS_IZQUIERDO ref2 TK_PARENTESIS_DERECHO  valoref subrutinas;
    ref:              'ref'|;
    //ref2:             ref expreSUB ref2|;


    expreSUB:         ID (',' ID)* TK_DOS_PUNTOS rmt expreSUB2|;
    expreSUB2:        TK_PUNTO_y_coma expreSUB|;
    valoref:          'retorna' tipodato especificacion 'inicio' sentencias 'retorna' TK_PARENTESIS_IZQUIERDO expre TK_PARENTESIS_DERECHO 'fin'
                        refSUB 'inicio' sentencias 'fin';
    refSUB:           'var' var especificacion|'const' const especificacion|'tipos' tipos especificacion|;
    idV:              ID idV2|'ascii' idV2;
    idV2:             TK_PARENTESIS_IZQUIERDO vectordef TK_PARENTESIS_DERECHO|TK_CORCHETE_IZQUIERDO vectordef TK_CORCHETE_DERECHO|TK_POTENCIACION vectordef|  ;
    vectordef:        TK_NUMERO|ID;
    funciones:        ID TK_PARENTESIS_IZQUIERDO expre? argumentos? TK_PARENTESIS_DERECHO;


    // TOKENS
    TK_ASIGNACION: '=';
    TK_COMA: ',';
    TK_CORCHETE_DERECHO: ']';
    TK_CORCHETE_IZQUIERDO: '[';
    TK_DISTINTO_DE: '<>';
    TK_DIVISION: '/';
    TK_DOS_PUNTOS: ':';
    TK_IGUAL_QUE: '==';
    TK_LLAVE_DERECHA: '}';
    TK_LLAVE_IZQUIERDA:'{';
    TK_MAYOR: '>';
    TK_MAYOR_igual: '>=';
    TK_MENOR: '<';
    TK_MENOR_IGUAL: '<=';
    TK_MODULO: '%';
    TK_MULTIPLICACION: '*';
    TK_PARENTESIS_DERECHO: ')';
    TK_PARENTESIS_IZQUIERDO: '(';
    TK_POTENCIACION: '^';
    TK_PUNTO: '.';
    TK_PUNTO_y_coma: ';';
    TK_RESTA: '-';
    TK_SUMA: '+';
    COMMENT       : '/*' .*? '*/' -> skip ;
    LINE_COMMENT   : '//' ~[\t\r\n]* -> skip ;

    ID : [-]?[A-Za-zñÑ_]+[A-Za-zñÑ0-9_]*;
    TK_NUMERO : Digits | (Digits '.' Digits? | '.' Digits) ExponentPart? [fFdD]?
                             |       Digits (ExponentPart [fFdD]? | [fFdD])
                             ;
    TK_CADENA :  '"'~["\n]*'"' | '\''~[\\'\n]*'\'';

    ESP : [ \t\r\n]+ -> skip;




    fragment ExponentPart
        : [eE] [+-]? Digits
        ;


    fragment Digits
        : '-'?[0-9] ([0-9_]* [0-9])?
        ;

    fragment EscapeSequence
        : '\\' [btnfr"'\\]
        | '\\' ([0-3]? [0-7])? [0-7]
        ;