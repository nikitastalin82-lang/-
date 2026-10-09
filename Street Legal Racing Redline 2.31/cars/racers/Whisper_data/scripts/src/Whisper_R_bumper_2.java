package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_R_bumper_2 extends Bumper
{
	public Whisper_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper custom bumper";
		description = "Custom rear bumper for Whisper models.";

		value = tHUF2USD(561.893);
		brand_new_prestige_value = 56.40;
	}
}
