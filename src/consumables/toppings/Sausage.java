package consumables.toppings;

import consumables.decorators.Consumable;
import consumables.decorators.ToppingDecorator;
import visitor.ConsumableVisitor;

public class Sausage extends ToppingDecorator
{
    public Sausage(Consumable parent)
    {
        super(parent);
    }
    
    @Override
    public String getName()
    {
        return parent.getName() + " Sausage";
    }

    @Override
    public double getCost()
    {
        return parent.getCost() + 1;
    }
    @Override
    public double getStockCost()
    {
        return parent.getCost() + 12;
    }

    @Override
    public String accept(ConsumableVisitor conVisitor)
    {
        return conVisitor.visit(this);
    }

    @Override
    public Object clone()
    {
        return new Sausage(this.parent);
    }
}