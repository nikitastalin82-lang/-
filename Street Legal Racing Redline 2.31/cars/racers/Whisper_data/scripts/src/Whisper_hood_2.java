package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_hood_2 extends Hood
{
	public Whisper_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper custom hood";
		description = "Custom hood for Whisper models.";

		value = tHUF2USD(660.219);
		brand_new_prestige_value = 56.40;
	}
}
