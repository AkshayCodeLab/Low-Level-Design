import DecoratorPizza.ExtraCheese;
import DecoratorPizza.ExtraMushroom;
import DecoratorPizza.ToppingDecorator;
import Pizza.BasePizza;
import Pizza.FarmhousePizza;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new FarmhousePizza();

        System.out.println("Cost of Base pizza is: " + pizza.cost());

        ToppingDecorator pizzaWithCheese = new ExtraCheese(pizza);
        System.out.println("Cost of base pizza with cheese: " + pizzaWithCheese.cost());

        ToppingDecorator pizzaWithCheeseMushroom = new ExtraMushroom(pizzaWithCheese);
        System.out.println("Cost of base pizza with cheese and mushroom: " + pizzaWithCheeseMushroom.cost());
    }
}