package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_FR_door extends FrontDoor
{
	public Whisper_FR_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper stock passenger's door";
		description = "Stock passenger's door for Whisper models.";

		value = tHUF2USD(384.02);
		brand_new_prestige_value = 40.50;
	}
}
