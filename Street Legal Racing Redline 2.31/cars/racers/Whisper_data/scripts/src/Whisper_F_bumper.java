package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_F_bumper extends Bumper
{
	public Whisper_F_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper stock front bumper";
		description = "Stock front bumper for Whisper models.";

		value = tHUF2USD(470.53);
		brand_new_prestige_value = 34.35;
	}
}
