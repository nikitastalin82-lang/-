package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_F_bumper_2 extends Bumper
{
	public Whisper_F_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper custom front bumper";
		description = "Custom front bumper for Whisper models.";

		value = tHUF2USD(609.79);
		brand_new_prestige_value = 56.40;
	}
}
