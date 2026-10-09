package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_R_windshield extends Windshield
{
	public Whisper_R_windshield( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper rear windshield";
		description = "Stock rear windshield for Whisper models.";

		value = tHUF2USD(397.946);
		brand_new_prestige_value = 40.50;
	}
}
