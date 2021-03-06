package consumables.basics;

import consumables.decorators.Consumable;
import visitor.ConsumableVisitor;

public class BasicTopping implements Consumable
{
	@Override
	public String getName()
	{
		return "";
	}
	
	@Override
	public double getCost()
	{
		return 0.25;
	}
	@Override
	public double getStockCost()
	{
		return 0.25;
	}

	@Override
	public String accept(ConsumableVisitor conVisitor)
	{
		return conVisitor.visit(this);
	}

	@Override
	public Object clone()
	{
		return new BasicTopping();
	}
}
