package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_L_headlights extends Headlights
{
	public Kurumma_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma stock left headlights";
		description = "Stock left headlights for Kurumma models.";

		value = tHUF2USD(107.399);
		brand_new_prestige_value = 41.47;
	}
}
