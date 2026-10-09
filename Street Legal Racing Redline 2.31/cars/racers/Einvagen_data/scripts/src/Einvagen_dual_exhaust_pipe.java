package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Einvagen_dual_exhaust_pipe extends ExhaustPipe
{
	public Einvagen_dual_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen GT dual exhaust pipe";

		description = "The dual exhaust system for all Einvagen GT models.";

		value = tHUF2USD(171.336);
		brand_new_prestige_value = 31.00;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
		mufflerSlotIDList.addElement(new Integer(3));
	}
}
