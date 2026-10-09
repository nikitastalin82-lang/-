package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Badge_R_exhaust_pipe extends ExhaustPipe
{
	public Badge_R_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge custom right exhaust pipe";

		description = "Custom exhaust system for all Badge models.";

		value = tHUF2USD(25.32);
		brand_new_prestige_value = 25.84;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
