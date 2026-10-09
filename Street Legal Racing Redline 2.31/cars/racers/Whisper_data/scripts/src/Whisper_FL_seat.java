package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_FL_seat extends FrontSeat
{
	public Whisper_FL_seat( int id )
	{
		super( id );
		carCategory = COMMON;
		name = "Whisper driver's seat";
		description = "Stock driver's seat for Whisper models.";

		value = tHUF2USD(264.383);
		brand_new_prestige_value = 40.50;
	}
}
