package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Ninja_stock_exhaust_pipe extends ExhaustPipe
{
	public Ninja_stock_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja stock exhaust pipe";

		description = "Stock exhaust system for all Ninja models.";

		value = tHUF2USD(46.209);
		brand_new_prestige_value = 17.62;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
