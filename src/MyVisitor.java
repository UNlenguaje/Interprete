import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Scanner;

public class MyVisitor extends  LenguajeBaseVisitor{

    HashMap<String, Object> table = new HashMap<String, Object>();

    @Override
    public Object visitVar(LenguajeParser.VarContext ctx) {

        if (ctx.children == null) {
            return super.visitVar(ctx);
        }

        //Anadir IDs a table
        for (TerminalNode id: ctx.ID()) {
            table.put(id.getText(), null);
        }

        return super.visitVar(ctx);
    }

    @Override
    public Object visitImprimir(LenguajeParser.ImprimirContext ctx) {

        String line = "";

        for (int i = 0; i < ctx.children.size(); i++) {

            String token = ctx.children.get(i).getText();

            if (token.equals(",")) {
                continue;
            } else {
                if (table.get(token) == null) {
                    line += token;
                } else {
                    line += table.get(token);
                }
            }
        }

        System.out.println(line.replace("\\n", "\n")
                .replace("\"", "")
                .replace("\\t", "\t")
                .replace("\\r", "\r"));

        return super.visitImprimir(ctx);
    }

    @Override
    public Object visitLeer(LenguajeParser.LeerContext ctx) {

        Scanner scanner = new Scanner(System.in);

        if (ctx.children == null) {
            return super.visitLeer(ctx);
        }

        for (TerminalNode id : ctx.ID()) {
            table.replace(id.getText(), scanner.next());
        }


        return super.visitLeer(ctx);
    }

    @Override
    public Object visitSi(LenguajeParser.SiContext ctx) {

        Boolean expre =(Boolean) visitExpre(ctx.expre());
        if (expre){
            for (int i = 0 ; i < ctx.sentencias().size();i++)
                visitSentencias(ctx.sentencias(i));
        }else{
            return visitChildren(ctx);
        }
        return ctx;
    }

    @Override
    public Object visitExpre(LenguajeParser.ExpreContext ctx) {
        int var1 =0, var2 = 0;
        if (table.get(ctx.getChild(0).getText()) != null){
            var1 =Integer.valueOf((String) table.get(ctx.getChild(0).getText()));
        }
        if (table.get(ctx.getChild(2).getText()) != null){
            var2 =Integer.parseInt((String) table.get(ctx.getChild(2).getText()));

        }else{
            var2 =Integer.parseInt( ctx.getChild(2).getText());

        }
        String oper = (String) visitOper(ctx.oper(0));
       if ( oper == ">="){
           return (var1 >=  var2);
       }

        System.out.println();
        System.out.println();
        //System.out.println(ctx.getChild(0));




        return super.visitExpre(ctx);
    }

    @Override
    public Object visitOper(LenguajeParser.OperContext ctx) {

       if (ctx.TK_MAYOR() != null) {
            return ">";
        }
        if (ctx.TK_DISTINTO_DE() != null) {
            return "!=";
        }
        if (ctx.TK_DIVISION() != null) {
            return "/";
        }if (ctx.TK_IGUAL_QUE() != null) {
            return "==";
        }
        if (ctx.TK_MAYOR_igual() != null) {
            return ">=";
        }
        if (ctx.TK_MENOR() != null) {
            return "<";
        }
        if (ctx.TK_MODULO() != null) {
            return "%";
        }
        if (ctx.TK_MULTIPLICACION() != null) {
            return "*";
        }
        if (ctx.TK_POTENCIACION() != null) {
            return "^";
        }if (ctx.TK_MENOR_IGUAL() != null) {
            return "<=";
        }
        if (ctx.TK_RESTA() != null) {
            return "-";
        }
        if (ctx.TK_SUMA()!= null) {
            return "<";
        }

        return super.visitOper(ctx);
    }

    @Override
    public Object visitSentencias(LenguajeParser.SentenciasContext ctx) {
        return super.visitSentencias(ctx);
    }
}
