package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_R_taillights_dark extends Taillights
{
	public Whisper_R_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper dark right taillights";
		description = "Dark right taillights for Whisper models.";

		value = tHUF2USD(183.882);
		brand_new_prestige_value = 44.50;
	}
}
