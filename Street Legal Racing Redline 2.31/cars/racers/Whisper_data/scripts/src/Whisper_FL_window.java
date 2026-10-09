package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Whisper_FL_window extends Window
{
	public Whisper_FL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper driver's window";
		description = "Stock driver's window for Whisper models.";

		value = tHUF2USD(328.316);
		brand_new_prestige_value = 34.35;
	}
}
