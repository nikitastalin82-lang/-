package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Baiern_L_DTM_exhaust_pipe extends ExhaustPipe
{
	public Baiern_L_DTM_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Baiern CoupeSport DTM stock left side exhaust pipe";

		description = "The stock left side exhaust system for the Baiern CoupeSport DTM.";

		value = tHUF2USD(1850.000);
		brand_new_prestige_value = 43.00;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
		mufflerSlotIDList.addElement(new Integer(3));
	}
}
