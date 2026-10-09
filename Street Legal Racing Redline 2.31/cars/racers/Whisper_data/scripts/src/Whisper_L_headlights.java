package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_L_headlights extends Headlights
{
	public Whisper_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper stock left headlights";
		description = "Stock left headlights for Whisper models.";

		value = tHUF2USD(238.43);
		brand_new_prestige_value = 41.47;
	}
}
