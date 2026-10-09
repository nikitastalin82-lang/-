package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class ST9_turbo_exhaust_pipe extends ExhaustPipe
{
	public ST9_turbo_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 turbo exhaust pipe";

		description = "Exhaust system for all turbocharged ST9 models.";

		value = tHUF2USD(69.121);
		brand_new_prestige_value = 31.14;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
