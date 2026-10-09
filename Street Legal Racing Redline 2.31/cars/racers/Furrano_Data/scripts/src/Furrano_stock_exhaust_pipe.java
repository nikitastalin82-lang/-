package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Furrano_stock_exhaust_pipe extends ExhaustPipe
{
	public Furrano_stock_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano stock exhaust pipe";

		description = "Stock exhaust system for Furrano models.";

		value = tHUF2USD(92.207);
		brand_new_prestige_value = 28.19;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
		mufflerSlotIDList.addElement(new Integer(3));
	}
}