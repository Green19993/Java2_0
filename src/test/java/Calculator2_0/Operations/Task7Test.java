package Calculator2_0.Operations;

import org.junit.Assert;
import org.junit.Test;

public class Task7Test {

    @Test
    public void CheckAddDouble() {
        Addition add = new Addition(16.2, -1.2);
        Assert.assertEquals("Сумма считается неверно", 15, add.doOperation(), 0);
    }

    @Test
    public void CheckAddZero(){
        Addition add1 = new Addition(12.5,0);
        Assert.assertEquals("Сумма с нулём считается неверно", 12.5, add1.doOperation(), 0);
    }

    @Test
    public void CheckSubDouble() {
        Subtraction sub = new Subtraction(1.2, -1.8);
        Assert.assertEquals("Разность считается неверно", 3, sub.doOperation(), 0);
    }

    @Test
    public void CheckSubZero() {
        Subtraction sub1 = new Subtraction(0, 11.1);
        Assert.assertEquals("Разность с нулём считается неверно", -11.1, sub1.doOperation(),0);
    }

    @Test
    public void CheckMultiDouble() {
        Multiplication multi = new Multiplication(111.11, 3);
        Assert.assertEquals("Произведение считается неверно", 333.33, multi.doOperation(), 0);
    }

    @Test
    public void CheckMultiZero() {
        Multiplication multi1 = new Multiplication(123.41,0);
        Assert.assertEquals("Умноженте на ноль выполняется неверно", 0, multi1.doOperation(), 0);
    }

    @Test
    public void CheckDivDouble() {
        Division div = new Division(153, 3);
        Assert.assertEquals("Деление считается неверно", 51, div.doOperation(), 0);
    }

    @Test
    public void CheckDivZero() {
        Division div1 = new Division(41.12, 0);
        Assert.assertEquals("Деление на ноль считается неверно", 1.1/0, div1.doOperation(),0);
    }
}