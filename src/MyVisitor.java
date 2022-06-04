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

        System.out.println(ctx.getText());

        return super.visitSi(ctx);
    }

    @Override
    public Object visitExpre(LenguajeParser.ExpreContext ctx) {


        if (ctx.children == null) {
            return super.visitExpre(ctx);
        }

        for (int i = 0; i < ctx.children.size(); i++) {

            /*String token = ctx.children.get(i).getText();
            if (table.get(token) !=  null) {
                continue;
            }*/
            //System.out.println(visit(ctx.children.get(i)));
            System.out.println(ctx.oper());

        }

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
}
