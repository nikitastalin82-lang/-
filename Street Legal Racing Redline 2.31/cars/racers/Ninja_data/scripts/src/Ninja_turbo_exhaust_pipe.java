package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Ninja_turbo_exhaust_pipe extends ExhaustPipe
{
	public Ninja_turbo_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja turbo exhaust pipe";

		description = "The turbo exhaust system for all Ninja models.";

		value = tHUF2USD(84.611);
		brand_new_prestige_value = 17.62;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
