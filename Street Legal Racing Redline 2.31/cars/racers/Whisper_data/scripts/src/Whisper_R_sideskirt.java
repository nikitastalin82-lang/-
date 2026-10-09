package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_R_sideskirt extends Sideskirt
{
	public Whisper_R_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper stock right sideskirt";
		description = "Stock right sideskirt for Whisper models.";

		value = tHUF2USD(337.389);
		brand_new_prestige_value = 47.21;
	}
}
