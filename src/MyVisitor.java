import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.prefs.Preferences;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class MyVisitor extends  LenguajeBaseVisitor{

    HashMap<String, String> table = new HashMap<>();

    FileWriter archivo = null;
    BufferedWriter writer = null;

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
    public Object visitConst(LenguajeParser.ConstContext ctx) {

        if (ctx.children == null) {
            return super.visitConst(ctx);
        }

        table.put(ctx.getChild(0).toString() , ctx.getChild(2).toString() );
        return super.visitConst(ctx);
    }

    @Override
    public Object visitIdsentencia(LenguajeParser.IdsentenciaContext ctx) {

        if(ctx.expre(0) == null) {
            int value = (Integer) visitInt(ctx.int_());
            table.replace(ctx.getParent().getChild(0).getText(), String.valueOf(value));
        } else {
            Double valor = (Double) visitExpre(ctx.expre(0));
            table.replace(ctx.getParent().getChild(0).getText(), valor.toString());
        }


        return ctx;
    }

    @Override
    public Object visitImprimir(LenguajeParser.ImprimirContext ctx) {

        String line = "";

        for (int i = 0; i < ctx.children.size(); i++) {

            String token = ctx.children.get(i).getText();

            if(ctx.getChild(i).getClass().getSimpleName().equals("ExpreContext")){
                double expresion = (Double)visitExpre(ctx.expre(0));
                line += expresion;

                continue;
           }

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

        /*System.out.println(line.replace("\\n", "\n")
                .replace("\\t", "\t")
                .replace("\\r", "\r")
                .replace("\"", ""));*/
        try {

            archivo = new FileWriter("10.out", true);

            writer = new BufferedWriter(archivo);


            writer.write(line.replace("\\n", "\n")
                    .replace("\\t", "\t")
                    .replace("\\r", "\r")
                    .replace("\"", ""));

            writer.newLine();

            writer.flush();


        }catch (IOException e){
            e.getCause();
        }



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
            for (int i = 0 ; i < ctx.sentencias().size();i++){
                visitSentencias(ctx.sentencias(i));
            }
        }else if (ctx.else_().children != null) {
            visitElse(ctx.else_());
            for (int i = 1 ; i < ctx.sentencias().size();i++){
                visitSentencias(ctx.sentencias(i));
            }

        } else{
            for (int i = 1 ; i < ctx.sentencias().size();i++){
                visitSentencias(ctx.sentencias(i));
            }
        }
        return ctx;
    }

    @Override
    public Object visitSielse(LenguajeParser.SielseContext ctx) {
        visitSentencias(ctx.sentencias());
        return ctx;
    }

    @Override
    public Object visitMientras(LenguajeParser.MientrasContext ctx) {

        if (ctx.children == null) {
            return super.visitMientras(ctx);
        }

        Boolean expre =(Boolean) visitExpre(ctx.expre());
        while(expre) {
            visitSentencias(ctx.sentencias(0));
            expre =(Boolean) visitExpre(ctx.expre());
        }
        return visitSentencias(ctx.sentencias(1));
    }

    @Override
    public Object visitDesde(LenguajeParser.DesdeContext ctx) {

        double h = (Double) visitExpre(ctx.expre(0));
        double j =  (Double) visitExpre(ctx.expre(1));
        double paso = (Double) visitExpre(ctx.incremento().expre());

        table.replace(ctx.ID().getText(), String.valueOf(h));

        if(paso > 0){
            for (int i = (int) h ; i <= (int)j;i += (int)paso){
                table.replace(ctx.ID().getText(), String.valueOf(i));
                visitSentencias(ctx.sentencias(0));
            }
        }else{
            for (int i = (int) h ; i >= (int)j;i += (int)paso){
                table.replace(ctx.ID().getText(), String.valueOf(i));
                visitSentencias(ctx.sentencias(0));
            }
        }
        visitSentencias(ctx.sentencias(1));

        return ctx;
    }

    @Override
    public Object visitInt(LenguajeParser.IntContext ctx) {
        double entero =(Double)visitExpre(ctx.expre().expre(0));
        int entero2 = (int)entero;
        return entero2;
    }

    @Override
    public Object visitRepetir(LenguajeParser.RepetirContext ctx) {
        Boolean expre =false;
        do{
            visitSentencias(ctx.sentencias(0));
            expre =(Boolean) visitExpre(ctx.expre());
        }while(!expre);
        return super.visitRepetir(ctx);

    }


    @Override
    public Object visitExpre(LenguajeParser.ExpreContext ctx) {
        Double var1 = null, var2 = null, resultado = null;
        String oper = null;
        Boolean valor = null;


        for (int i = 0 ; i < ctx.children.size(); i++ ){

            if (var1 == null && (i == 0)){
                if (table.get(ctx.getChild(i).getText()) != null){

                    var1 =Double.parseDouble(table.get(ctx.getChild(i).getText()));}
                else {
                    var1 = Double.parseDouble( ctx.getChild(i).getText());
                }
                if (i==0) valor = var1 != 0 ;

            }else if (ctx.getChild(i).getClass().getSimpleName().equals("OperContext")) {
                oper = ctx.getChild(i).getText();
                //System.out.println(var1 + " entra oper");


            } else if (var2 == null){

                if(oper != null && var1 == null){
                    var1 = resultado;

                }

                if (table.get(ctx.getChild(i).getText()) != null){
                    var2 =Double.parseDouble(table.get(ctx.getChild(i).getText()));}
                else {
                    var2 = Double.parseDouble(ctx.getChild(i).getText());
                }
                if (oper.equals(">=")){
                    valor = var1 >= var2;
                    oper = null;
                    var1 = null;
                    var2 = null;
                }else if (oper.equals("==")){
                    valor = var1.equals(var2) ;
                    oper = null;
                    var1 = null;
                    var2 = null;
                }else if (oper.equals("<=")){
                    valor = var1 <= var2;
                    oper = null;
                    var1 = null;
                    var2 = null;
                }else if (oper.equals("<")){
                    valor = var1 < var2;
                    oper = null;
                    var1 = null;
                    var2 = null;
                }else if (oper.equals(">")){
                    valor = var1 > var2;
                    oper = null;
                    var1 = null;
                    var2 = null;
                }else if (oper.equals("<>")){
                    valor = !var1.equals(var2);
                    oper = null;
                    var1 = null;
                    var2 = null;
                }else if (oper.equals("+")){
                    resultado = var1 + var2;
                    oper = null;
                    var1 = null;
                    var2 = null;
                }else if (oper.equals("-")){
                    resultado = var1 - var2;
                    oper = null;
                    var1 = null;
                    var2 = null;
                }else if (oper.equals("*")){
                    resultado = var1 * var2;
                    oper = null;
                    var1 = null;
                    var2 = null;
                }else if (oper.equals("/")){
                    resultado = var1 / var2;
                    oper = null;
                    var1 = null;
                    var2 = null;
                }else if (oper.equals("%")){
                    resultado = var1 % var2;
                    oper = null;
                    var1 = null;
                    var2 = null;
                }else if (oper.equals("^")){
                    resultado = Math.pow(var1 ,var2);
                    oper = null;
                    var1 = null;
                    var2 = null;
                }
            }


            }
/*
        for (int i = 0 ; i < ctx.children.size(); i++ ){
            System.out.println(ctx.getChild(i).getClass().getSimpleName().equals("OperContext") );
        }
*/
        //System.out.println(ctx.getChild(0));
        if(resultado != null){
            return resultado;
        } else if (var1 != null) {
            return var1;

        }
        return valor;



        //return super.visitExpre(ctx);
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
            return "+";
        }

        return super.visitOper(ctx);
    }

    @Override
    public Object visitSentencias(LenguajeParser.SentenciasContext ctx) {

        return super.visitSentencias(ctx);
    }
}
