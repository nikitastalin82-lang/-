package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Whisper_L_V10_exhaust_pipe extends ExhaustPipe
{
	public Whisper_L_V10_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper stock left V10 exhaust pipe";

		description = "Stock left side exhaust system for Whisper models powered by V10 engines.";

		value = tHUF2USD(203.112);
		brand_new_prestige_value = 32.89;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
