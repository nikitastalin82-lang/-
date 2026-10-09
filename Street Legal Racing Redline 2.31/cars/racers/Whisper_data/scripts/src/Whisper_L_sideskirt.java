package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_L_sideskirt extends Sideskirt
{
	public Whisper_L_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper stock left sideskirt";
		description = "Stock left sideskirt for Whisper models.";

		value = tHUF2USD(337.389);
		brand_new_prestige_value = 47.21;
	}
}
