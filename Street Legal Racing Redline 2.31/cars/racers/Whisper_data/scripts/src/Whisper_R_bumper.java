package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_R_bumper extends Bumper
{
	public Whisper_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper stock rear bumper";
		description = "Stock rear bumper for Whisper models.";

		value = tHUF2USD(459.925);
		brand_new_prestige_value = 34.35;
	}
}
