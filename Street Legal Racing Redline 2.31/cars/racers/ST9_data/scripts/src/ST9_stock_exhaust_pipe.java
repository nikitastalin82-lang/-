package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class ST9_stock_exhaust_pipe extends ExhaustPipe
{
	public ST9_stock_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 stock exhaust pipe";

		description = "Stock exhaust system for all ST9 models.";

		value = tHUF2USD(45.154);
		brand_new_prestige_value = 24.67;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
