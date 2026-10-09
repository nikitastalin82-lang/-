package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Coyot_stock_exhaust_pipe extends ExhaustPipe
{
	public Coyot_stock_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot stock exhaust pipe";

		description = "Stock exhaust system for all Coyot models.";

		value = tHUF2USD(60.557);
		brand_new_prestige_value = 21.14;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
