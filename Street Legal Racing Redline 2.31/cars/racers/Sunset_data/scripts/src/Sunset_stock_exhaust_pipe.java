package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Sunset_stock_exhaust_pipe extends ExhaustPipe
{
	public Sunset_stock_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset stock exhaust pipe";

		description = "Stock exhaust system for all Sunset models.";

		value = tHUF2USD(60.135);
		brand_new_prestige_value = 21.14;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
