package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_trunk extends Trunk
{
	public Whisper_trunk( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper trunk";
		description = "Stock trunk for Whisper models.";

		value = tHUF2USD(160.149);
		brand_new_prestige_value = 34.35;
	}
}
