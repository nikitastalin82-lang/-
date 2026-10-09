package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_R_headlights_halo_cyan extends Headlights
{
	public Whisper_R_headlights_halo_cyan( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper halogen cyan right headlights";
		description = "Halo cyan right headlights for Whisper models.";

		value = tHUF2USD(513.12);
		brand_new_prestige_value = 67.99;
	}
}
