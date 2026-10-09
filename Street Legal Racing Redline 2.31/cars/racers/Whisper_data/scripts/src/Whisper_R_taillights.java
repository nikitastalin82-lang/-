package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_R_taillights extends Taillights
{
	public Whisper_R_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper right taillights";
		description = "Stock right taillights for Whisper models.";

		value = tHUF2USD(181.882);
		brand_new_prestige_value = 40.50;
	}
}
