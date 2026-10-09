package java.game.cars;

import java.game.*;
import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Teg_stock_exhaust_pipe extends ExhaustPipe
{
	public Teg_stock_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg stock exhaust pipe";

		description = "Stock exhaust system for all Teg models.";

		value = tHUF2USD(51.906);
		brand_new_prestige_value = 19.97;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
		mufflerSlotIDList.addElement(new Integer(3));
	}
}
