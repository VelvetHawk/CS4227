package consumables.basics;

import consumables.decorators.Consumable;
import visitor.ConsumableVisitor;

public class BasicFood implements Consumable
{
	@Override
	public String getName()
	{
		return "";
	}
	
	@Override
	public double getCost()
	{
		return 3.50;
	}

	@Override
	public double getStockCost()
	{
		return 2.50;
	}

	@Override
	public String accept(ConsumableVisitor conVisitor)
	{
		return conVisitor.visit(this);
	}

	@Override
	public Object clone()
	{
		return new BasicFood();
	}
}
