package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Sunset_turbo_exhaust_pipe extends ExhaustPipe
{
	public Sunset_turbo_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset turbo exhaust pipe";

		description = "Turbo exhaust system for all Sunset models.";

		value = tHUF2USD(85.135);
		brand_new_prestige_value = 21.14;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
