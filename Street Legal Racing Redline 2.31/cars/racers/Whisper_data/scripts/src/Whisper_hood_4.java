package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_hood_4 extends Hood
{
	public Whisper_hood_4( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper blower hood";
		description = "Tuning hood for Whisper models with a hole for blower.";

		value = tHUF2USD(681.121);
		brand_new_prestige_value = 88.83;
	}
}
