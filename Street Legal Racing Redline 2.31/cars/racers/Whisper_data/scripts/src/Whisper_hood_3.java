package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_hood_3 extends Hood
{
	public Whisper_hood_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper tuner hood";
		description = "Aero hood for Whisper models.";

		value = tHUF2USD(725.207);
		brand_new_prestige_value = 70.36;
	}
}
