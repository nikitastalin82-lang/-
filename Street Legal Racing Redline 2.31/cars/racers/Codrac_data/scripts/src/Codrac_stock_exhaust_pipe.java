package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Codrac_stock_exhaust_pipe extends ExhaustPipe
{
	public Codrac_stock_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac stock exhaust pipe";

		description = "Stock exhaust system for all Codrac models.";

		value = tHUF2USD(60.557);
		brand_new_prestige_value = 18.79;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
		mufflerSlotIDList.addElement(new Integer(3));
	}
}
