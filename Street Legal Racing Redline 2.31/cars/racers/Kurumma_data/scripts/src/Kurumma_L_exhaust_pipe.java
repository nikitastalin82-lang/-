package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Kurumma_L_exhaust_pipe extends ExhaustPipe
{
	public Kurumma_L_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma stock left exhaust pipe";

		description = "Stock exhaust system for all Kurumma models.";

		value = tHUF2USD(43.888);
		brand_new_prestige_value = 25.84;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
