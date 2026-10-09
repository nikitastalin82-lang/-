package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_hood extends Hood
{
	public Whisper_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper stock hood";
		description = "Stock hood for Whisper models.";

		value = tHUF2USD(521.803);
		brand_new_prestige_value = 34.35;
	}
}
