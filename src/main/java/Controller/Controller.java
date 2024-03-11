package Controller;

import Expression.*;
import View.ViewMenu;

import java.util.Scanner;

public class Controller {

    private final ViewMenu viewMenu = new ViewMenu();
    Double oneDig = printOnConsoleDigit();
    Double secondDig = printOnConsoleDigit2();
    int operation = printOnConsoleOp();


    int memoryDigit;
    private final Operation oper = new Operation(operation);

    public void cicleCalc(){
        boolean exit = false;
        while(!exit) {
            getOperat();
            if (oper.getOperation() == 9) {
                exit = true;
            }
        }
    }
    public void getOperat(){
        int op = oper.getOperation();
        switch (op){
            case 1:
                memoryResult.setResultDigit(summa.expDig());
                viewMenu.resultOp(memoryResult.getResultDigit());
                oper.setOperation(printOnConsoleOp());
                oneDig = memoryResult.getResultDigit();
                if(oper.getOperation() == 1) {
                    secondDig = printOnConsoleDigit2();
                    summa.setOneDigit(oneDig);
                    summa.setSecondDigit(secondDig);
                    summa.expDig();
                    System.out.println(summa);
                } else if (oper.getOperation() == 2) {
                    secondDig = printOnConsoleDigit2();
                    diff.setOneDigit(oneDig);
                    diff.setSecondDigit(secondDig);
                    diff.expDig();
                } else if (oper.getOperation() == 3) {
                    secondDig = printOnConsoleDigit2();
                    multipl.setOneDigit(oneDig);
                    multipl.setSecondDigit(secondDig);
                    multipl.expDig();
                } else if (oper.getOperation() == 4) {
                    secondDig = printOnConsoleDigit2();
                    division.setOneDigit(oneDig);
                    division.setSecondDigit(secondDig);
                    division.expDig();
                }
                break;
            case 2:
                memoryResult.setResultDigit(diff.expDig());
                viewMenu.resultOp(memoryResult.getResultDigit());
                oper.setOperation(printOnConsoleOp());
                oneDig = memoryResult.getResultDigit();
                if(oper.getOperation() == 2) {
                    secondDig = printOnConsoleDigit2();
                    diff.setOneDigit(oneDig);
                    diff.setSecondDigit(secondDig);
                    diff.expDig();
                } else if (oper.getOperation() == 1) {
                    secondDig = printOnConsoleDigit2();
                    summa.setOneDigit(oneDig);
                    summa.setSecondDigit(secondDig);
                    summa.expDig();
                } else if (oper.getOperation() == 3) {
                    secondDig = printOnConsoleDigit2();
                    multipl.setOneDigit(oneDig);
                    multipl.setSecondDigit(secondDig);
                    multipl.expDig();
                } else if (oper.getOperation() == 4) {
                    secondDig = printOnConsoleDigit2();
                    division.setOneDigit(oneDig);
                    division.setSecondDigit(secondDig);
                    division.expDig();
                }
                break;
            case 3:
                memoryResult.setResultDigit(multipl.expDig());
                viewMenu.resultOp(memoryResult.getResultDigit());
                oper.setOperation(printOnConsoleOp());
                oneDig = memoryResult.getResultDigit();
                if(oper.getOperation() == 3) {
                    secondDig = printOnConsoleDigit2();
                    multipl.setOneDigit(oneDig);
                    multipl.setSecondDigit(secondDig);
                    multipl.expDig();
                } else if (oper.getOperation() == 1) {
                    secondDig = printOnConsoleDigit2();
                    summa.setOneDigit(oneDig);
                    summa.setSecondDigit(secondDig);
                    summa.expDig();
                } else if (oper.getOperation() == 2) {
                    secondDig = printOnConsoleDigit2();
                    diff.setOneDigit(oneDig);
                    diff.setSecondDigit(secondDig);
                    diff.expDig();
                } else if (oper.getOperation() == 4) {
                    secondDig = printOnConsoleDigit2();
                    division.setOneDigit(oneDig);
                    division.setSecondDigit(secondDig);
                    division.expDig();
                }
                break;
            case 4:
                if(secondDig != 0){
                    memoryResult.setResultDigit(division.expDig());
                    viewMenu.resultOp(memoryResult.getResultDigit());
                    oper.setOperation(printOnConsoleOp());
                    oneDig = memoryResult.getResultDigit();
                    if(oper.getOperation() == 4) {
                        secondDig = printOnConsoleDigit2();
                        division.setOneDigit(oneDig);
                        division.setSecondDigit(secondDig);
                        division.expDig();
                    } else if (oper.getOperation() == 1) {
                        secondDig = printOnConsoleDigit2();
                        summa.setOneDigit(oneDig);
                        summa.setSecondDigit(secondDig);
                        summa.expDig();
                    } else if (oper.getOperation() == 2) {
                        secondDig = printOnConsoleDigit2();
                        diff.setOneDigit(oneDig);
                        diff.setSecondDigit(secondDig);
                        diff.expDig();
                    } else if (oper.getOperation() == 3) {
                        secondDig = printOnConsoleDigit2();
                        multipl.setOneDigit(oneDig);
                        multipl.setSecondDigit(secondDig);
                        multipl.expDig();
                    }

                } else {
                    viewMenu.NullErrorMes();
                    oneDig = memoryResult.getResultDigit();
                    secondDig = printOnConsoleDigit2();
                    division.setOneDigit(oneDig);
                    division.setSecondDigit(secondDig);
                    division.expDig();
                }
                break;
            default:
                viewMenu.OpErrorMes();
                oper.setOperation(printOnConsoleOp());
                getOperat();
                break;
        }
    }
    private double printOnConsoleDigit(){
        viewMenu.enterDig();
        Scanner scanDig1 = new Scanner(System.in);
        double oneDig = scanDig1.nextInt();
        return oneDig;
    }
    public double printOnConsoleDigit2(){
        viewMenu.enterDig();
        Scanner scanDig2 = new Scanner(System.in);
        double secondDig = scanDig2.nextInt();
        return secondDig;
    }
    public int printOnConsoleOp() {
        viewMenu.enterOperation();
        Scanner scanOper = new Scanner(System.in);
        int operation = scanOper.nextInt();
        return operation;
    }

    private final Summa summa = new Summa(oneDig, secondDig);
    private final Diff diff = new Diff(oneDig, secondDig);
    private final Multipl multipl = new Multipl(oneDig, secondDig);
    private final Division division = new Division(oneDig, secondDig);
    private final MemoryResult memoryResult = new MemoryResult(memoryDigit);

}
