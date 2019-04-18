package consumables.drinks;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.DrinkDecorator;
import visitor.ConsumableVisitor;

public class Water extends DrinkDecorator
{
    public Water(Consumable parent)
    {
        super(parent);
    }

    public Water(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return parent.getName() + " Water";
    }

    @Override
    public double getCost()
    {
        return parent.getCost() + .5;
    }

    @Override
    public double getStockCost()
    {
        return parent.getCost();
    }

    @Override
    public String accept(ConsumableVisitor conVisitor){
        String description = conVisitor.visit(this);
        return description;
    }
}