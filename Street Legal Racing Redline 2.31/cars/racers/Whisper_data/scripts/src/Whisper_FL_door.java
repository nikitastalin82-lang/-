package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_FL_door extends FrontDoor
{
	public Whisper_FL_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper stock driver's door";
		description = "Stock driver's door for Whisper models.";

		value = tHUF2USD(384.02);
		brand_new_prestige_value = 40.50;
	}
}
