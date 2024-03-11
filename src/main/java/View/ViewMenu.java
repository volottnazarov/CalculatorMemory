package View;

public class ViewMenu {

    public void enterDig(){
        System.out.println("Введите число: ");
    }
    public void enterOperation(){
        System.out.println("Введите номер арифметической операции: ");
        System.out.println("Сложение: 1, Вычитание: 2, Умножение: 3, Деление: 4 ");
        System.out.println("Сброс калькулятора нажмите: 9");
    }
    public void NullErrorMes(){
        System.out.println("ОШИБКА! На ноль делить нельзя! ");
    }
    public void OpErrorMes(){
        System.out.println("ОШИБКА! Введите число из списка...");
    }
    public void resultOp(double dig){
        System.out.println(dig);
    }


}
