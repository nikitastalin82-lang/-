package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_L_headlights_halo_purple extends Headlights
{
	public Whisper_L_headlights_halo_purple( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper halogen purple left headlights";
		description = "Halo purple left headlights for Whisper models.";

		value = tHUF2USD(513.12);
		brand_new_prestige_value = 67.99;
	}
}
