package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_L_mirror extends Mirror
{
	public Whisper_L_mirror( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper stock left mirror";
		description = "Stock left mirror for Whisper models.";

		value = tHUF2USD(208.046);
		brand_new_prestige_value = 40.50;
	}
}
