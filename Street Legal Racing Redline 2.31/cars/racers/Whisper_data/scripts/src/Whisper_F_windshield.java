package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_F_windshield extends Windshield
{
	public Whisper_F_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper front windshield";
		description = "Stock front windshield for Whisper models.";

		value = tHUF2USD(406.808);
		brand_new_prestige_value = 40.50;
	}
}
