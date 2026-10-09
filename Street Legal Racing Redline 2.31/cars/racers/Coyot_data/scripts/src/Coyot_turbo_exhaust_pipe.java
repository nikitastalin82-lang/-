package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Coyot_turbo_exhaust_pipe extends ExhaustPipe
{
	public Coyot_turbo_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot turbo exhaust pipe";

		description = "The turbo exhaust system for all Coyot models.";

		value = tHUF2USD(91.152);
		brand_new_prestige_value = 21.14;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
