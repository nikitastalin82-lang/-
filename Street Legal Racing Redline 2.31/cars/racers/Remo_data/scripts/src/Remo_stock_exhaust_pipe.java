package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Remo_stock_exhaust_pipe extends ExhaustPipe
{
	public Remo_stock_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo stock exhaust pipe";

		description = "Stock exhaust system for all Remo models.";

		value = tHUF2USD(62.456);
		brand_new_prestige_value = 16.44;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
